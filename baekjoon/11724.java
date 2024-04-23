import java.io.*;
import java.util.*;

class Main {
    public static boolean[][] graph;
    public static boolean[] visited;
    public static int count, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new boolean[N+1][N+1];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true;
        }

        count = 0;
        visited = new boolean[N+1];
        for(int i = 1; i <= N; i++) {
            if(visited[i] == false) {
                DFS(i);
                count++;
            }
        }

        System.out.print(count);
    }

    public static void DFS(int v) {
        if(visited[v]) {
            return;
        }
        visited[v] = true;

        for(int i = 1; i <= N; i++) {
            if(graph[v][i]) {
                DFS(i);
            }
        }
    }
}