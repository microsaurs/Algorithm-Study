import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int k = st.countTokens();
            BigInteger[] measurements = new BigInteger[k];

            for (int j=0; j<k; j++) {
                measurements[j] = new BigInteger(st.nextToken());
            }

            if(isNautilus(measurements)) {
                sb.append("NAUTILUS\n");
            } else {
                sb.append("SNAIL\n");
            }
        }
        System.out.println(sb);

       
    }
    
    static boolean isNautilus(BigInteger[] m) {
        int k = m.length;
        if(k >= 1 && !m[0].equals(BigInteger.ZERO)) return false;
        if(k >= 2 && !m[1].equals(BigInteger.ONE)) return false;
        if(k >= 3 && !m[2].equals(BigInteger.valueOf(2))) return false;
        if(k >= 4 && !m[3].equals(BigInteger.valueOf(3))) return false;

        for(int i=4; i<k; i++) {
            BigInteger expected = m[i-1].add(m[i-2]).add(m[i-3]).add(m[i-4]);
            if(!m[i].equals(expected)) {
                return false;
            }
        }
        return true;
    }
}