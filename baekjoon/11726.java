import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= 1000; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        int n = Integer.parseInt(br.readLine());
        System.out.print(dp[n]);
    }
}