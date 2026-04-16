import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList[n+1];
        
        for(int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        int minSum = Integer.MAX_VALUE;
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sum = bfs(i);

            if(sum < minSum) {
                minSum = sum;
                answer = i;
            }
        }

        System.out.println(answer);

    }

    static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        int[] dist = new int[n+1];
    
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int cur = q.poll();
            
            for(int next : graph[cur]) {
                if(!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                    q.offer(next);
                }
            }
        }

        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += dist[i];
        }

        return sum;
    }
}