import java.io.*;
import java.util.*;

class Main {
    static int n;
    static int[][] houses;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static List<Integer> cnts = new ArrayList<>();
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        houses = new int[n][n];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < n; j++) {
                houses[i][j] = s.charAt(j) - '0';
            }
        }

        visited = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(houses[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    cnts.add(cnt);
                    cnt = 1;
                }
            }
        }

        Collections.sort(cnts);
        System.out.println(cnts.size());
        for(int num : cnts) {
            System.out.println(num);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx>=0 && ny>=0 && nx<n && ny<n && !visited[nx][ny] && houses[nx][ny]==1) {
                cnt++;
                dfs(nx,ny);
            }
        }
    }
}