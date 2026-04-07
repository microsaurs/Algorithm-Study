import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int idx = 1;
        boolean success = true;

        for(int target : arr) {
            while(idx <= target) {
                dq.push(idx++);
                sb.append('+').append('\n');
            }

            if(!dq.isEmpty() && dq.peek() == target) {
                dq.pop();
                sb.append('-').append('\n');
            } else {
                success = false;
                break;
            }
        }

        
        System.out.println(success ? sb : "NO");
    }
}