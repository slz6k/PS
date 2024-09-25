import java.io.*;
import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int m, n;
    static int[][] tomato;
    static int day = 0;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        tomato = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if(tomato[i][j] == 1) {
                    queue.offer(new int[] {i, j});
                }
            }
        }
        System.out.print(bfs());
    }

    public static int bfs() {
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(tomato[nx][ny] == 0) {
                        queue.offer(new int[] {nx, ny});
                        tomato[nx][ny] = tomato[x][y] + 1;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(tomato[i][j] == 0) {
                    return -1;
                }
                day = Math.max(day, tomato[i][j]);
            }
        }

        return day - 1;
    }
}