import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int beer = Integer.parseInt(st.nextToken());
        int malt = Integer.parseInt(st.nextToken());
        int wine = Integer.parseInt(st.nextToken());
        int soft = Integer.parseInt(st.nextToken());
        int seltzer = Integer.parseInt(st.nextToken());
        int water = Integer.parseInt(st.nextToken());

        System.out.println(beer*5 + malt*5 + wine*5 + soft*5 + seltzer*5 + water*5);
    }
}

