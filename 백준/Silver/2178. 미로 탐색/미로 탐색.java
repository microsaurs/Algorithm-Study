import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};  // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        maze = new int[n][m];
        visited = new boolean[n][m];
        
        // 미로 정보 입력 (한 줄로 붙어서 들어옴)
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j) - '0';  // 문자를 숫자로 변환
            }
        }
        
        // BFS 시작: (0,0)에서 출발
        int result = bfs(0, 0);
        System.out.println(result);
    }
    
    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        maze[x][y] = 1;  // 시작점의 거리는 1
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            // 상하좌우 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                // 범위 체크
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    // 이동 가능하고 아직 방문하지 않은 칸
                    if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        // 이전 칸의 거리 + 1
                        maze[nx][ny] = maze[cx][cy] + 1;
                    }
                }
            }
        }
        
        // 도착점(n-1, m-1)까지의 거리 반환
        return maze[n-1][m-1];
    }
}