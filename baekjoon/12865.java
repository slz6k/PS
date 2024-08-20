import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] stuffs = new int[n+1][2];
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            stuffs[i][0] = Integer.parseInt(st.nextToken());
            stuffs[i][1] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[k+1];
        for(int i = 1; i <= n; i++) {
            int w = stuffs[i][0];
            int v = stuffs[i][1];
            for(int j = k; j >= w; j--) {
                dp[j] = Math.max(dp[j], dp[j-w] + v);
            }
        }
        System.out.println(dp[k]);
    }
}