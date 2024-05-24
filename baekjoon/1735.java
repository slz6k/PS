import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int x = (b * d) / getGCD(b, d);
        a *= (x / b);
        c *= (x / d);
        int y = a + c;
        System.out.println((y / getGCD(x, y)) + " " + (x / getGCD(x, y)));
    }

    public static int getGCD(int A, int B) {
        if (A % B == 0) {
            return B;
        }
        return getGCD(B, A % B);
    }
}