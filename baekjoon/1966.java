import java.io.*;
import java.util.*;

class Main {
    static class Doc {
        int index, priority;
        public Doc(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int x = 0 ; x < t; x++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            PriorityQueue<Doc> pQueue = new PriorityQueue<>(new Comparator<Doc>() {
                @Override
                public int compare(Doc o1, Doc o2) {
                    return o2.priority - o1.priority;
                }
            });
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                pQueue.offer(new Doc(i, Integer.parseInt(st.nextToken())));
            }
            int count = 0;
            while(!pQueue.isEmpty()) {
                Doc d = pQueue.poll();
                count++;
                if(d.index == m) {
                    sb.append(count).append("\n");
                    break;
                }
            }
        }

        System.out.print(sb);
    }
}