import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] reds = new int[n];
        int[] greens = new int[n];
        int[] blues = new int[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            reds[i] = Integer.parseInt(st.nextToken());
            greens[i] = Integer.parseInt(st.nextToken());
            blues[i] = Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[n][3];
        dp[0][0] = reds[0];
        dp[0][1] = greens[0];
        dp[0][2] = blues[0];
        for(int i = 1; i < n; i++) {
            dp[i][0] += reds[i] + Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] += greens[i] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] += blues[i] + Math.min(dp[i-1][0], dp[i-1][1]);
        }
        System.out.print(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
    }
}