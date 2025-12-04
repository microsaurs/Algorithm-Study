import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String s = "LoveisKoreaUniversity";
        
        for(int i=0; i<n; i++) {
            if(i==n-1) {
                sb.append(s);
            } else {
                sb.append(s).append(" ");
            }
        }

        System.out.print(sb);
    }
}

