import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            sb.append(getPrime(n)).append("\n");
        }
        System.out.print(sb);
    }

    public static long getPrime(long n) {
        for(long i = n; ; i++) {
            if(isPrime(i)) {
                return i;
            }
        }
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