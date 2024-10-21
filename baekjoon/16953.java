import java.io.*;
import java.util.*;

class Main {
    static long A, B;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.print(bfs());
    }

    public static int bfs() {
        Queue<Long> queue = new LinkedList<>();
        queue.add(A);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                long temp = queue.poll();

                if(temp == B) {
                    return cnt + 1;
                }

                if(temp * 2 <= B) {
                    queue.add(temp * 2);
                }

                if(temp * 10 + 1 <= B) {
                    queue.add(temp * 10 + 1);
                }
            }

            cnt++;
        }

        return -1;
    }
}