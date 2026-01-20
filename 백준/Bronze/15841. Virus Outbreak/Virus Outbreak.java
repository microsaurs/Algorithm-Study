import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger[] fib = new BigInteger[491];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        for (int i = 2; i <= 490; i++) {
            fib[i] = fib[i-1].add(fib[i-2]);
        }

        while (true) {
            int hour = Integer.parseInt(br.readLine());
            if (hour == -1) break;
        
            sb.append("Hour ").append(hour).append(": ").append(fib[hour]).append(" cow(s) affected\n");
        }

        System.out.print(sb);
    }
}