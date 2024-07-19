import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long a = 1;
            long b = 1;
            for(int i = 0; i < n; i++) {
                a *= (m-i);
            }
            for(int i = n; i > 0; i--) {
                b *= i;
            }
            sb.append(a/b).append("\n");
        }
        System.out.print(sb);
    }
}