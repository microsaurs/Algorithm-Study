import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        
        int k = Integer.parseInt(br.readLine());
        for(int i=0; i<k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            board[r-1][c-1] = 1;
        }

        int l = Integer.parseInt(br.readLine());
        Map<Integer, Character> turnInfo = new HashMap<>();

        for(int i=0; i<l ;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            turnInfo.put(x,c);
        }

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        Deque<int[]> snake = new ArrayDeque<>();
        snake.offerLast(new int[]{0,0});
        board[0][0] = 2;

        int dir = 0;
        int time = 0;
        int row = 0; 
        int col = 0;
        
        while(true) {
            time++;

            int nr = row + dr[dir];
            int nc = col + dc[dir];

            // 벽 충돌
            if(nr < 0 || nr >= n || nc < 0 || nc >= n) break;

            // 몸 충돌
            if (board[nr][nc] == 2) break;

            // 머리 이동
            if(board[nr][nc] == 1) {
                board[nr][nc] = 2;
                snake.offerLast(new int[]{nr, nc});
            } else {
                board[nr][nc] = 2;
                snake.offerLast(new int[]{nr, nc});

                int[] tail = snake.pollFirst();
                board[tail[0]][tail[1]] = 0;
            }

            row = nr;
            col = nc;

            // 방향 전환
            if (turnInfo.containsKey(time)) {
                char turn = turnInfo.get(time);

                if(turn == 'D') {
                    dir = (dir + 1) % 4;
                } else if (turn == 'L') {
                    dir = (dir + 3) % 4;
                }
            }
        }
        System.out.println(time);
    }
}