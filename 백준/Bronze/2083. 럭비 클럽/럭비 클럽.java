import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        
        while(!(line = br.readLine()).equals("# 0 0")) {
            StringTokenizer st = new StringTokenizer(line);

            String name = st.nextToken();
            String s;
            if(Integer.parseInt(st.nextToken()) > 17 || Integer.parseInt(st.nextToken()) >= 80) {
                s = "Senior";
            } else {
                s = "Junior";
            }

            System.out.println(name + " " + s);
        }
    }
}