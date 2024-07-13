import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n+1];
        for(int i = 1; i <= n; i++) {
            dp[i] = dp[i-1] + i-1;
        }
        System.out.println(dp[n]);
        System.out.println(2);
    }
}