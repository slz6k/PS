import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        boolean[] isPrime = new boolean[1000001];
        for(int i = 2; i <= 1000000; i++) {
            isPrime[i] = isPrime(i);
        }

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            for(int i = 2; i <= n / 2; i++) {
                if(isPrime[i] && isPrime[n-i]) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    public static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i * i <= n ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}