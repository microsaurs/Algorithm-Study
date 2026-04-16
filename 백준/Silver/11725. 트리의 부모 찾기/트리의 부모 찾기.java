import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static ArrayList<Integer>[] graph;
    static int[] parent;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        graph = new ArrayList[n+1];

        for(int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[n+1];
        parent = new int[n+1];
        
        bfs(1);

        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=n; i++) {
            sb.append(parent[i]).append('\n');
        }

        System.out.print(sb);
    }

    static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int cur = q.poll();

            for(int next : graph[cur]) {
                if(!visited[next]) {
                    visited[next] = true;
                    parent[next] = cur;
                    q.offer(next);
                }
            }
        }
    }
}