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

        for(int x = 0 ; x < t; x++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            LinkedList<Doc> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < n; i++) {
                queue.offer(new Doc(i, Integer.parseInt(st.nextToken())));
            }

            int count = 0;
            while(!queue.isEmpty()) {
                Doc d = queue.poll();
                boolean isHighestPriority = true;

                for (Doc doc : queue) {
                    if (doc.priority > d.priority) {
                        isHighestPriority = false;
                        break;
                    }
                }

                if (!isHighestPriority) {
                    queue.offer(d);
                } else {
                    count++;
                    if(d.index == m) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.print(sb);
    }
}