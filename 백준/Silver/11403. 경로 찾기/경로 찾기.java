import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        graph = new ArrayList[n];

        for(int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                int a = Integer.parseInt(st.nextToken());
                if(a == 1) {
                    graph[i].add(j);
                }
            }
        }

        int[][] answer = new int[n][n];
        
        for(int i=0; i<n; i++) {
            boolean[] visited = bfs(i);
            for(int j=0; j<n; j++) {
                if(visited[j]) answer[i][j] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sb.append(answer[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    static boolean[] bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];

        q.offer(start);

        while (!q.isEmpty()) {
            int cur = q.poll();

            for(int next : graph[cur]) {
                if(!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
        return visited;
    }
}