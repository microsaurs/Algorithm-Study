import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] arr = new int[10];
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            arr[c-'0']++;
        }
        
        int max = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) continue;
            max = Math.max(max, arr[i]);
        }

        int sixNine = arr[6] + arr[9];
        int sixNineCount = (sixNine + 1) / 2;

        max = Math.max(max, sixNineCount);

        System.out.println(max);
    }
}