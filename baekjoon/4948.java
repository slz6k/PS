import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }
            sb.append(cntPrime(n)).append("\n");
        }
        System.out.println(sb);
    }

    public static int cntPrime(int n) {
        int cnt = 0;
        for(int i = n+1; i <= 2 * n; i++) {
            if(isPrime(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isPrime(long n) {
        if(n < 2) {
            return false;
        }

        if(n == 2) {
            return true;
        }

        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}