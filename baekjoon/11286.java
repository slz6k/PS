import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                }
                return (int) (Math.abs(o1) - Math.abs(o2));
            }
        });

        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                sb.append(pq.isEmpty()? 0 : pq.poll()).append("\n");
            } else {
                pq.add(x);
            }
        }

        System.out.println(sb);
    }
}