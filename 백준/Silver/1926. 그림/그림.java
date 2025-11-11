import java.io.*;
import java.util.*;

public class Main {
    static int n, m;	// 도화지 세로, 가로
    static int[][] paper; // 2차원 도화지 배열
    static boolean[][] visited;	// 방문 여부
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        paper = new int[n][m];
        visited = new boolean[n][m];
        
        // 도화지 배열 초기화
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int count = 0;    // 그림의 개수
        int maxArea = 0;  // 최대 넓이
        
        // 모든 칸 순회
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 1이고 아직 방문하지 않은 칸이면 새로운 그림 시작
                if (paper[i][j] == 1 && !visited[i][j]) {
                    count++;
                    int area = bfs(i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        
        System.out.println(count);
        System.out.println(maxArea);
    }
    
    // BFS로 연결된 그림의 넓이 구하기
    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        int area = 1;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            // 상하좌우 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                // 범위 체크 및 조건 확인
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (paper[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        area++;
                    }
                }
            }
        }
        
        return area;
    }
}