import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;

        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}

