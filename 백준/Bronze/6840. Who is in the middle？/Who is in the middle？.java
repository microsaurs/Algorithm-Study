import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] weights = new int[3];
        weights[0] = Integer.parseInt(br.readLine());
        weights[1] = Integer.parseInt(br.readLine());
        weights[2] = Integer.parseInt(br.readLine());

        Arrays.sort(weights);

        System.out.println(weights[1]);
    }
}

