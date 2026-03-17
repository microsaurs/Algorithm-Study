import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[100][100];
        
        for(int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            for(int j=sx; j<ex; j++) {
                for(int z = sy; z<ey; z++) {
                    arr[z][j] = 1;
                }
            }
        }

        int count = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(arr[i][j] == 1) count++;
            }
        }

        System.out.println(count);
    }
}