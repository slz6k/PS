import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> balloons = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            int balloon = Integer.parseInt(st.nextToken());
            balloons.add(new int[] {i + 1, balloon});
        }

        StringBuilder sb = new StringBuilder();
        while(!balloons.isEmpty()) {
            int[] current = balloons.pollFirst();
            sb.append(current[0]).append(" ");
            if(balloons.isEmpty()) {
                break;
            }

            if(current[1] > 0) {
                for(int i = 1; i < current[1]; i++) {
                    balloons.addLast(balloons.pollFirst());
                }
            } else {
                for(int i = current[1]; i < 0; i++) {
                    balloons.addFirst(balloons.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}