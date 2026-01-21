import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int max = 0;
        int cur = 0;
        char prev = ' ';

        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            
            if(c == 'a' || c == 'h') {
                if(cur == 0 || c != prev) {
                    cur++;
                    prev = c;
                } else {
                    max = Math.max(max, cur);
                    cur = 1;
                    prev = c;
                } 
            } else {
                max = Math.max(max, cur);
                cur = 0;
                prev = ' ';
            }
        }
        max = Math.max(max, cur);
        
        System.out.println(max);
    }
}