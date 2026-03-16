import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] onoff = new int[n+1];
        for(int i=1; i<=n; i++) {
            onoff[i] = Integer.parseInt(st.nextToken());
        }
        
        int m = Integer.parseInt(br.readLine());
        for(int i=1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int switchNo = Integer.parseInt(st.nextToken());
            if(gender == 1) {
                for (int j = switchNo; j <= n; j += switchNo) {
                    onoff[j] = 1 - onoff[j];
                }
            } else {
                int left = switchNo;
                int right = switchNo;

                while (left - 1 >= 1 && right + 1 <= n && onoff[left - 1] == onoff[right + 1]) {
                    left--;
                    right++;
                }

                for (int j = left; j <= right; j++) {
                    onoff[j] = 1 - onoff[j];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
                System.out.print(onoff[i] + " ");
                if (i % 20 == 0) {
                    System.out.println();
            }
        }
    }
}