import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> s1 = new ArrayDeque<>();
        Deque<Integer> s2 = new ArrayDeque<>();
        Deque<Integer> s3 = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            s1.addLast(Integer.parseInt(st.nextToken()));
        }

        int target = n;
        int move = 0;
        StringBuilder sb = new StringBuilder();

        while (target >= 1) {

            if (s1.contains(target)) {

                while (s1.peekLast() != target) {
                    int x = s1.removeLast();
                    s2.addLast(x);
                    sb.append(1).append(" ").append(2).append('\n');
                    move++;
                }

                int x = s1.removeLast();
                s3.addLast(x);
                sb.append(1).append(" ").append(3).append('\n');
                move++;
            }

            else {

                while (s2.peekLast() != target) {
                    int x = s2.removeLast();
                    s1.addLast(x);
                    sb.append(2).append(" ").append(1).append('\n');
                    move++;
                }

                int x = s2.removeLast();
                s3.addLast(x);
                sb.append(2).append(" ").append(3).append('\n');
                move++;
            }

            target--;
        }

        System.out.println(move);
        System.out.print(sb);
    }
}