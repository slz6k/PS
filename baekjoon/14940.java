import java.io.*;
import java.util.*;

class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n, m;
    static int[][] map, distance;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        distance = new int[n][m];
        visited = new boolean[n][m];
        int targetX = -1, targetY = -1;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2) {
                    targetX = i;
                    targetY = j;
                }
                if(map[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        bfs(targetX, targetY);

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(!visited[i][j] && map[i][j] == 1) {
                    sb.append(-1).append(" ");
                } else {
                    sb.append(distance[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();

            for(int i = 0; i < 4; i++) {
                int nextX = tmp[0] + dx[i];
                int nextY = tmp[1] + dy[i];
                if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m ) {
                    if(!visited[nextX][nextY]) {
                        visited[nextX][nextY] = true;
                        distance[nextX][nextY] = distance[tmp[0]][tmp[1]] + 1;
                        queue.add(new int[] {nextX, nextY});
                    }
                }
            }
        }
    }
}