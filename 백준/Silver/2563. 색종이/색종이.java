import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] size = new int[100][100];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());     
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=y; j<y+10; j++) {
                for(int z=x; z<x+10; z++) {
                    size[j][z] = 1;
                }
            }
        }

        int count = 0;

        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(size[i][j] == 1) count++;
            }
        }

        System.out.println(count);
    }
}