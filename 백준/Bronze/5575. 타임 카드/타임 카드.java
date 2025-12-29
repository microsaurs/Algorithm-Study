import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sh = Integer.parseInt(st.nextToken());
            int sm = Integer.parseInt(st.nextToken());
            int ss = Integer.parseInt(st.nextToken());

            int eh = Integer.parseInt(st.nextToken());
            int em = Integer.parseInt(st.nextToken());
            int es = Integer.parseInt(st.nextToken());

            int start = sh * 3600 + sm * 60 + ss;
            int end = eh * 3600 + em * 60 + es;

            int time = end - start;

            int h = time / 3600;
            int m = (time % 3600) / 60;
            int s = time % 60;

            sb.append(h).append(' ').append(m).append(' ').append(s).append('\n');
        }

        System.out.print(sb);
    }
}