import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> passwordMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            passwordMap.put(st.nextToken(), st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(passwordMap.get(st.nextToken())).append("\n");
        }

        System.out.println(sb);
    }
}