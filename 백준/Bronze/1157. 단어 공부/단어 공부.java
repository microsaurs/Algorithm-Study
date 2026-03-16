import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();        
        int[] count = new int[26];
        
        for(char c : s.toCharArray()) {
            count[c-'A']++;
        }

        int max = -1;
        char answer = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = (char)(i + 'A');
            } 
            else if (count[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}