import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int x = Math.min(a, Math.min(b, c));

        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int y = Math.min(d, e);

        System.out.println(x+y-50);
    }
}