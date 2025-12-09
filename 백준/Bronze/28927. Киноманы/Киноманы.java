import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int e1 = Integer.parseInt(st.nextToken());
        int f1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st.nextToken());
        int e2 = Integer.parseInt(st.nextToken());
        int f2 = Integer.parseInt(st.nextToken());

        int max = t1*3 + e1*20 + f1*120;
        int mel = t2*3 + e2*20 + f2*120;

        if(max > mel) {
            System.out.println("Max");
        } else if (max < mel) {
            System.out.println("Mel");
        } else {
            System.out.println("Draw");
        }
    }
}