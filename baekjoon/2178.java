import java.io.*;
import java.util.*;

class Main {
    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < m; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(graph[n-1][m-1]);
    }

    public static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = now.x + dx[i];
                int nextY = now.y + dy[i];

                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m)
                    continue;

                if (graph[nextX][nextY] == 0)
                    continue;

                if (visited[nextX][nextY])
                    continue;

                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;

                graph[nextX][nextY] = graph[now.x][now.y] + 1;
            }
        }
    }

    public static class Point {
        int x, y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}