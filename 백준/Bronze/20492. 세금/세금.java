import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int one = (int)(N*0.78);
        int two = (int)(N-(N*0.2*0.22));

        System.out.println(one+ " " + two);
    }
}

