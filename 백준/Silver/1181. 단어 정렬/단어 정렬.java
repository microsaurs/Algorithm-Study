import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append('\n');
        }

        System.out.print(sb);
        
    }
}