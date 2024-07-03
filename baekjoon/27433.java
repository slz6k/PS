import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibo(N));
    }

    public static long fibo(int N) {
        if(N == 0 || N == 1) {
            return 1;
        }

        return fibo(N-1) * N;
    }
}