import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N+1][10];
        int MOD = 1000000000;

        for(int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for(int i = 2; i <= N; i++) {
            dp[i][0] = dp[i-1][1] % MOD;
            dp[i][9] = dp[i-1][8] % MOD;
            for(int j = 1; j <= 8; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
            }
        }

        long answer = 0;
        for(int i = 0; i < 10; i++) {
            answer = (answer + dp[N][i]) % MOD;
        }

        System.out.print(answer);
    }
}