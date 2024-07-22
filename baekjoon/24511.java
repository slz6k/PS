import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] isQ = new boolean[n];
        for(int i = 0; i < n; i++) {
            isQ[i] = st.nextToken().equals("0");
        }

        Deque<Integer> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(isQ[i]) {
                deque.add(a);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(m-- > 0) {
            int b = Integer.parseInt(st.nextToken());
            deque.addFirst(b);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
