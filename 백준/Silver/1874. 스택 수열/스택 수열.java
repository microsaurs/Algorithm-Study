import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;
        boolean possible = true;

        for(int i=1; i<=n; i++) {
            int target = Integer.parseInt(br.readLine());

            while(num <= target) {                
                    stack.push(num++);
                    sb.append('+').append('\n');
            }
            
            if(!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append('-').append('\n');
            } else {
                possible = false;
                break;
            }
        }

        System.out.println(possible ? sb.toString() : "NO");

    }
}