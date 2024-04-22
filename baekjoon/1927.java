import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(pQ.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pQ.poll()).append("\n");
                }
            } else {
                pQ.offer(x);
            }
        }
        System.out.print(sb);
    }
}