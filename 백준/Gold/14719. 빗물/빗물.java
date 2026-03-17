import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[] height = new int[w];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<w; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for(int i=1; i<w-1; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for(int l=0; l<i; l++) {
                leftMax = Math.max(leftMax, height[l]);
            }

            for(int r=i+1; r<w; r++) {
                rightMax = Math.max(rightMax, height[r]);
            }

            int water = Math.min(leftMax, rightMax) - height[i];

            if(water > 0) {
                answer += water;
            }
        }
        System.out.println(answer);
    }
}