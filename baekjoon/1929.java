import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] isPrime = new boolean[N+1];
        for(int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for(int i = 2; i <= Math.sqrt(N); i++) {
            if(isPrime[i]) {
                int j = 2;
                while (i * j <= N) {
                    isPrime[i * j] = false;
                    j++;
                }
            }
        }

        for(int i = M; i <= N; i++) {
            if(isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}