import java.io.*;
import java.util.*;

class Main {
    static int N, M, R;
    static int cnt = 0;
    static int[] orders;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        orders = new int[N+1];
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(R);

        for(int i = 1; i <= N; i++) {
            System.out.println(orders[i]);
        }
    }

    public static void dfs(int node) {
        visited[node] = true;
        cnt++;
        orders[node] = cnt;

        for(int next : graph[node]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}