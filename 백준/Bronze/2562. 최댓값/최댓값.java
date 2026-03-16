import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=9; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            max = Math.max(n, max);
        }

        System.out.println(max);

        for(int i=1; i<=9; i++) {
            if(arr[i] == max) {
                System.out.println(i);
            }
        }
    }
}