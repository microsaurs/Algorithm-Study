import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int[][] snails = new int[n][n];
        snails[0][0] = n*n;

        int row = n / 2;
        int col = n / 2;
        snails[row][col] = 1;

        int[] dr = {-1, 0, 1, 0}; // 위, 오른쪽, 아래, 왼쪽
        int[] dc = {0, 1, 0, -1};

        int num = 2;
        int len = 1;
        int targetRow = row + 1;
        int targetCol = col + 1;

        while (num <= n * n) {
            for (int dir = 0; dir < 4; dir++) {
                for (int i = 0; i < len; i++) {
                    if (num > n * n) break;

                    row += dr[dir];
                    col += dc[dir];
                    snails[row][col] = num;

                    if (num == target) {
                        targetRow = row + 1;
                        targetCol = col + 1;
                    }

                    num++;
                }

                // 방향 2번마다 이동 칸 수 증가
                if (dir % 2 == 1) {
                    len++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(snails[i][j]).append(" ");
            }
            sb.append("\n");
        }

        sb.append(targetRow).append(" ").append(targetCol);
        System.out.print(sb);
    }
}