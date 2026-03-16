import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashMap<Integer, Integer> cards = new HashMap<>();
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            cards.put(num, cards.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(cards.getOrDefault(num, 0)).append(' ');
        }
        
        System.out.println(sb);
    }
}