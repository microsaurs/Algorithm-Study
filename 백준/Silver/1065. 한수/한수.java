import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
    
        int cnt = 0;
    
        for(int i=1; i<=N; i++) {
            String s = String.valueOf(i);
            int a = i % 10;
            int b = (i/10) % 10;
            int c = (i/100)%10;
            int d = i/1000;
    
            if (s.length() <= 2) {
                cnt++;
            } else if (s.length() == 3) {
                if(b-a == c-b) {
                    cnt++;
                }
            } else {
                if(d-c == c-b && c-b == b-a) {
                    cnt++;
                }
            }
        }

    System.out.println(cnt);
    }
}
