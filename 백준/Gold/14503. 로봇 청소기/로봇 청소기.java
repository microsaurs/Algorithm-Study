import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());
        
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        
        int[][] room = new int[n][m];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cleaned = 0;

        while(true) {
            if(room[row][col] == 0) {
                room[row][col] = 2;
                cleaned++;
            }

            boolean found = false;
            for(int i=0; i<4; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];
                if(room[nr][nc] == 0) {
                    found = true;
                    break;
                }
            }

            if(found) {
                dir = (dir + 3) % 4;
                int nr = row + dr[dir];
                int nc = col + dc[dir];

                if(room[nr][nc] == 0) {
                    row = nr;
                    col = nc;
                }
            } else {
                int backDir = (dir + 2) % 4;
                int brRow = row + dr[backDir];
                int brCol = col + dc[backDir];

                if(room[brRow][brCol] != 1) {
                    row = brRow;
                    col = brCol;
                } else {
                    break;
                }
            }
        }

        System.out.println(cleaned);
    }
}