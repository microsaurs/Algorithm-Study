import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int n = s.length();

        for(int i=n-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }

        System.out.print(sb);
    }
}

