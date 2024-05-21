import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        System.out.print((A * B) / getGCD(A, B));
    }

    public static long getGCD(long A, long B) {
        if (A % B == 0) {
            return B;
        }
        return getGCD(B, A % B);
    }
}