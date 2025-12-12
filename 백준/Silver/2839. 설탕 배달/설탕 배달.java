import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int five = n / 5; five >= 0; five --) {
            int remaining = n - (five * 5);

            if(remaining % 3 == 0) {
                int three = remaining / 3;
                System.out.println(five + three);
                return;
            }
        }

        System.out.println(-1);
    }
}