import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s;

        for(int i=1; i<=n; i++) {
            s = br.readLine();
            sb.append(i).append(". ").append(s).append('\n');
        }

        System.out.println(sb);
    }
}