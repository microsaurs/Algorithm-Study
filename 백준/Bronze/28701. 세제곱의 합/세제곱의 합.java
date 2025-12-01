import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum1 = 0;
        int sum3 = 0;
        
        for(int i=1; i<=n; i++) {
            sum1 += i;
            sum3 += i*i*i;
        }
        
        int sum2 = sum1 * sum1;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}

