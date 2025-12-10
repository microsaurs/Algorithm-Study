import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            BigInteger n = new BigInteger(br.readLine());

            if(n.equals(BigInteger.ZERO)) {
                break;
            }

            System.out.println(n.remainder(BigInteger.valueOf(42)).equals(BigInteger.ZERO) ? "PREMIADO" : "TENTE NOVAMENTE");
        }
    }
}