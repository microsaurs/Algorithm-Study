import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
            Deque<Character> stack = new ArrayDeque<>();
            String ps = br.readLine();
            for(char c : ps.toCharArray()) {
                if(c == '(') stack.push(c);
                else {
                    if(stack.size() != 0 && stack.peek() == '(') stack.poll();
                    else  stack.push(c);
                }
            }
            sb.append(stack.size() == 0 ? "YES" : "NO").append('\n');            
        }
        System.out.println(sb);
    }
}