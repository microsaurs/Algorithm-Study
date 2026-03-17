import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] nums = new int[9][9];
        
        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = nums[0][0];
        int row = 1;
        int col = 1;

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(nums[i][j] > max) {
                    max = nums[i][j];
                    row = i+1;
                    col = j+1;
                } 
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}