import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;
        for(int i = 4; i <= 1000; i++) {
            dp[i] = (dp[i-2] * 2 + dp[i-1]) % 10007;
        }
        System.out.print(dp[n]);
    }
}