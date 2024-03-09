import java.io.*;
import java.util.*;

class Main {
    public static boolean[][] networks;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());
        StringTokenizer st;
        networks = new boolean[computer+1][computer+1];
        for(int i = 0; i < pair; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            networks[a][b] = true;
            networks[b][a] = true;
        }
        boolean[] visited = new boolean[computer+1];
        dfs(1, visited);
        System.out.println(count-1);
    }

    public static void dfs(int v, boolean[] visited) {
        visited[v] = true;
        count++;

        for(int i = 0; i < networks[v].length; i++) {
            if(networks[v][i]) {
                if(!visited[i]) {
                    dfs(i, visited);
                }
            }
        }
    }
}