import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());

        int total = a * 3600 + b * 60 + c;
        
        total += d;
        total %= 86400;

        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;

        System.out.println(h + " " + m + " " + s);
        
    }
}