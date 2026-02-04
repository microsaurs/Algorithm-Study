import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] list = new int[9];
        int index = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<9; i++) {
            list[i] = Integer.parseInt(br.readLine());

            if(list[i] > max) {
                max = list[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);

    }
}