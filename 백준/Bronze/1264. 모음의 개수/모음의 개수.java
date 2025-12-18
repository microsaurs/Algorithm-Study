import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        while (!(s = br.readLine()).equals("#")) {
            int count = 0;
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if("aeiouAEIOU".indexOf(c) != -1) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}