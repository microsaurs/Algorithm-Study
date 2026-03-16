import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();        
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(arr[c-'a'] == -1) {
                arr[c-'a'] = i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++) {
                sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
    }
}