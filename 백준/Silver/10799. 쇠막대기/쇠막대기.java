import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Deque<Character> dq = new ArrayDeque<>();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                dq.addLast(c);
            } else {
                dq.removeLast();

                if (s.charAt(i - 1) == '(') {
                    answer += dq.size();
                } else {
                    answer += 1;
                }
            }
        }

        System.out.println(answer);
    }
}