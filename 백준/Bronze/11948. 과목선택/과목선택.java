import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int[] arr = {a,b,c,d};

        Arrays.sort(arr);
        
        int sum = arr[3] + arr[2] + arr[1];

        int max = Math.max(e,f);

        System.out.println(sum + max);
    }
}