import java.io.*;
import java.util.*;

class Main {
    public static boolean[][] graph;
    public static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int count = 0;
            graph = new boolean[M][N];

            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a][b] = true;
            }

            visited = new boolean[M][N];
            for(int i = 0; i < M; i++) {
                for(int j = 0; j < N; j++) {
                    if(graph[i][j] && !visited[i][j]) {
                        count++;
                        dfs(i, j);
                    }
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }

    public static void dfs(int i, int j) {
        if(graph[i][j] && !visited[i][j]) {
            visited[i][j] = true;
            if(i+1 < graph.length) {
                dfs(i+1, j);
            }
            if(i-1 >= 0) {
                dfs(i-1, j);
            }
            if(j+1 < graph[i].length) {
                dfs(i, j+1);
            }
            if(j-1 >= 0) {
                dfs(i, j-1);
            }
        }
    }

}