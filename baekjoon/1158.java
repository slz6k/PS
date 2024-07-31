import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 1; i <= n; i++) {
            dq.add(i);
        }

        List<Integer> list = new ArrayList<>();
        while(dq.size() > 0) {
            for(int i = 0 ; i < k-1; i++) {
                dq.add(dq.poll());
            }
            list.add(dq.poll());
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');
        for(int i = 0; i < n-1; i++) {
            sb.append(list.get(i)).append(", ");
        }
        sb.append(list.get(n-1)).append(">");

        System.out.print(sb);
    }
}