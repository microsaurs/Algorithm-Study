import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int t = 0; t < n; t++) {
            String s = br.readLine();
            boolean[] visited = new boolean[26];

            boolean isGroupWord = true;
            char prev = 0;

            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);

                if (current != prev) {
                    if (visited[current - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    visited[current - 'a'] = true;
                }

                prev = current;
            }

            if (isGroupWord) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}