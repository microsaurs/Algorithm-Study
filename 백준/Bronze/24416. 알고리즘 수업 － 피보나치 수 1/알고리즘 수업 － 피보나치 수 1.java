import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        
        int code1 = f[n];
        int code2 = n - 2;
        
        System.out.println(code1 + " " + code2);
    }
}