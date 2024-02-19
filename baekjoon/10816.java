import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());
        int[] counts = new int[20000001];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            counts[10000000+Integer.parseInt(st.nextToken())]++;
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            sb.append(counts[10000000+Integer.parseInt(st.nextToken())]).append(" ");
        }
        System.out.println(sb);
    }
}