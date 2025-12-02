import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(n > b) {
            System.out.println("Bus");
        } else {
            if(a < b) {
                System.out.println("Bus");
            } else if (a > b) {
                System.out.println("Subway");
            } else {
                System.out.println("Anything");
            }
        }
    }
}

