import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> numMap = new HashMap<>();
        HashMap<String, Integer> nameMap = new HashMap<>();

        for(int i=1; i<=n; i++) {
            String s = br.readLine();
            numMap.put(i, s);
            nameMap.put(s, i);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++) {
            String s = br.readLine();

            if(Character.isDigit(s.charAt(0))) {
                int num = Integer.parseInt(s);
                sb.append(numMap.get(num)).append('\n');
            } else {
                sb.append(nameMap.get(s)).append('\n');
            }
        }
        System.out.println(sb);
    }
}