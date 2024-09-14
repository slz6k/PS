import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.print(multiply(a, b, c));
    }

    public static long multiply(long a, long b, long c) {
        if(b == 0) {
            return 1;
        }

        long result = multiply(a, b/2, c);
        result = (result * result) % c;

        if(b % 2 == 1) {
            result = (result * a) % c;
        }

        return result;
    }
}