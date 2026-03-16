import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // String[] arr = s.split("\\+|-");
        String[] minus = s.split("-");
        int answer = 0;

        for (int i = 0; i < minus.length; i++) {
            String[] plus = minus[i].split("\\+");
            int sum = 0;

            for (String num : plus) {
                sum += Integer.parseInt(num);
            }

            if (i == 0) {
                answer += sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);


        
    }
}