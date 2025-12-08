import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        if(s.contains("7")) {
            System.out.println(n % 7 == 0 ? 3 : 2);
        } else {
            System.out.println(n % 7 == 0 ? 1 : 0);
        }
    }
}

