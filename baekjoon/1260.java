import java.io.*;
import java.util.*;

class Main {
    public static boolean[] visited;
    public static ArrayList<Integer>[] nodes;
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        nodes = new ArrayList[n+1];

        for(int i = 0; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes[a].add(b);
            nodes[b].add(a);
        }

        for(int i = 0; i <= n; i++) {
            Collections.sort(nodes[i]);
        }

        dfs(v, new boolean[n+1]);
        sb.append("\n");
        bfs(v, new boolean[n+1]);

        System.out.println(sb);
    }

    public static void dfs(int v, boolean[] visited) {
        visited[v] = true;
        sb.append(v).append(" ");
        for(int node : nodes[v]) {
            if(!visited[node]) {
                dfs(node, visited);
            }
        }
    }

    public static void bfs(int v, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);
        while(!q.isEmpty()) {
            v = q.poll();
            sb.append(v).append(" ");
            for(int node : nodes[v]) {
                if(!visited[node]) {
                    q.add(node);
                    visited[node] = true;
                }
            }
        }
    }
}