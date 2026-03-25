import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];     

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int left = 0;
        int right = n-1;

        int min = Integer.MAX_VALUE;
        int answer1 = 0;
        int answer2 = 0;

        while(left < right) {
            int curr = arr[left] + arr[right];

            if(Math.abs(curr)< min) {
                min = Math.abs(curr);
                answer1 = arr[left];
                answer2 = arr[right];
            }

            if(curr<0) {
                left++;
            } else if(curr>0) {
                right--;
            } else {
                break;
            }
        }
        System.out.println(answer1 + " " + answer2);
    }
}