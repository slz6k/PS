import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger[] dp = new BigInteger[101];
        dp[1] = new BigInteger("1");
        dp[2] = new BigInteger("1");
        dp[3] = new BigInteger("1");
        for(int i = 4; i <= 100; i++) {
            dp[i] = dp[i-3].add(dp[i-2]);
        }
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N]).append("\n");
        }
        System.out.print(sb);
    }
}