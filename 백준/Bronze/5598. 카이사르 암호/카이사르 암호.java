import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c <= 'C') {
                sb.append((char)(c + 23));
            } else {
                sb.append((char)(c - 3));
            }
        }
        System.out.println(sb);
    }
}