import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }

    public static long factorial(int N) {
        if(N == 0 || N == 1) {
            return 1;
        }

        return factorial(N-1) * N;
    }
}