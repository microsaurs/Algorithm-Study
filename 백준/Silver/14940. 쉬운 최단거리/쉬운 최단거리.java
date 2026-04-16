import java.io.*;
import java.util.*;

public class Main {
    static class Node {
    int r, c;

    Node(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] answer = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        int startR = 0;
        int startC = 0;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if(arr[i][j] == 2) {
                    startR = i;
                    startC = j;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(startR, startC));
        visited[startR][startC] = true;

        while(!q.isEmpty()) {
            Node cur = q.poll();

            for(int d=0; d<4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];

                if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if(visited[nr][nc]) continue;
                if (arr[nr][nc] == 0) continue;
                
                visited[nr][nc] = true;
                answer[nr][nc] = answer[cur.r][cur.c] + 1;
                q.offer(new Node(nr, nc));
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 0) {
                    sb.append(0).append(" ");
                } else if(!visited[i][j]) {
                    sb.append(-1).append(" ");
                } else {
                    sb.append(answer[i][j]).append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}