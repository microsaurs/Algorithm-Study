import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] fib = new long[46];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= 45; i++) {
            fib[i] = fib[i-1] + (fib[i-2]);
        }

        for(int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());
            System.out.println(fib[x]);
        }

    }
}