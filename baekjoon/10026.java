import java.io.*;
import java.util.*;

class Main {
    static int N;
    static char[][] paintings;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paintings = new char[N][N];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            paintings[i] = s.toCharArray();
        }

        visited = new boolean[N][N];
        int cnt1 = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    dfs1(i, j, paintings[i][j]);
                    cnt1++;
                }
            }
        }

        visited = new boolean[N][N];
        int cnt2 = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    dfs2(i, j, paintings[i][j]);
                    cnt2++;
                }
            }
        }

        System.out.print(cnt1 + " " + cnt2);
    }

    private static void dfs1(int x, int y, char color) {
        if(x < 0 || x >= N || y < 0 || y >= N || visited[x][y] || paintings[x][y] != color) {
            return;
        }

        visited[x][y] = true;

        dfs1(x+1, y, color);
        dfs1(x-1, y, color);
        dfs1(x, y+1, color);
        dfs1(x, y-1, color);
    }

    private static void dfs2(int x, int y, char color) {
        if(x < 0 || x >= N || y < 0 || y >= N || visited[x][y] ) {
            return;
        }

        if(color == 'R' || color == 'G') {
            if(paintings[x][y] != 'R' && paintings[x][y] != 'G') {
                return;
            }
        } else if(paintings[x][y] != color) {
            return;
        }

        visited[x][y] = true;

        dfs2(x+1, y, color);
        dfs2(x-1, y, color);
        dfs2(x, y+1, color);
        dfs2(x, y-1, color);
    }
}