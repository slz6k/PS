import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        while(N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch(Integer.parseInt(st.nextToken())) {
                case 1:
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    sb.append(dq.isEmpty()? -1 : dq.removeFirst()).append("\n");
                    break;
                case 4:
                    sb.append(dq.isEmpty()? -1 : dq.removeLast()).append("\n");
                    break;
                case 5:
                    sb.append(dq.size()).append("\n");
                    break;
                case 6:
                    sb.append(dq.isEmpty()? 1 : 0).append("\n");
                    break;
                case 7:
                    sb.append(dq.isEmpty()? -1 : dq.getFirst()).append("\n");
                    break;
                case 8:
                    sb.append(dq.isEmpty()? -1 : dq.getLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}