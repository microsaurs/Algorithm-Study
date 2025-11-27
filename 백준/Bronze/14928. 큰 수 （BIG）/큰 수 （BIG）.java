import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        
        int MOD = 20000303;
        long remainder = 0;
        
        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % MOD;
        }
        
        System.out.println(remainder);
    }
}

