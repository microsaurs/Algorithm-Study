import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // DP 테이블 생성 (n줄까지)
        int[][] dp = new int[n + 1][n + 1];
        
        // 파스칼의 삼각형 만들기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    // 첫 번째와 마지막은 1
                    dp[i][j] = 1;
                } else {
                    // 위 줄의 왼쪽 + 오른쪽
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }
        
        System.out.println(dp[n][k]);
        sc.close();
    }
}