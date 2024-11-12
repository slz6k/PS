import java.io.*;
import java.util.*;

public class Main {
    static int K = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 3, 2);

        System.out.println(K);
        System.out.print(sb);
    }

    public static void hanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            K++;
            return;
        }

        hanoi(n - 1, from, aux, to);
        sb.append(from).append(" ").append(to).append("\n");
        K++;
        hanoi(n - 1, aux, to, from);
    }
}