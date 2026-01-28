import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] pizza = new int[N+1];

        pizza[1] = 0;
        for(int i=2; i<=N; i++) {
            int maxScore = 0;

            for(int j=1; j<=i/2; j++) {
                int score = j * (i-j) + pizza[j] + pizza[i-j];
                maxScore = Math.max(maxScore, score);
            }

            pizza[i] = maxScore;
        }

        System.out.println(pizza[N]);
    }
}