import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        if(a % c == 0 || b % d == 0) {
            System.out.println(a / c > b / d ? l - (a/c) : l - (b/d));
        } else {
            System.out.println(a / c > b / d ? l - (a/c+1) : l - (b/d+1));
        }
        
    }
}