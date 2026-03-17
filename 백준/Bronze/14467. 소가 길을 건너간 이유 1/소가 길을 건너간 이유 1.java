import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] cows = new int[11];
        Arrays.fill(cows, -1);
        int count = 0;

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());

            if(cows[num] == -1) {
                cows[num] = dir;
            } else {
                if(cows[num] != dir) {
                    count++;
                    cows[num] = dir;
                }
            }
        }
        System.out.print(count);
    }
    
}