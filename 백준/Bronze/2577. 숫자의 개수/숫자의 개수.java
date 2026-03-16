import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String n = Integer.toString(a*b*c);

        int[] count = new int[10];

        for(int i=0; i<n.length(); i++) {
            char ch = n.charAt(i);
            count[ch -'0']++;
        }

        for(int i=0; i<10; i++) {
            System.out.println(count[i]);
        }
    }
}