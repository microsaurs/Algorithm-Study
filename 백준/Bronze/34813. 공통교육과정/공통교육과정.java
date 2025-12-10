import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if(s.charAt(0) == 'F') {
            System.out.println("Foundation");
        } else if (s.charAt(0) == 'C') {
            System.out.println("Claves");
        } else if (s.charAt(0) == 'V') {
            System.out.println("Veritas");
        } else {
            System.out.println("Exploration");
        }
    }
}