import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int year = 2024;
        int month = 8;

        month += (n-1) * 7;

        while(month > 12) {
            month -= 12;
            year++;
        }

        System.out.println(year + " " + month);
    }
}