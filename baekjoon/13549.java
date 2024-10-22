import java.io.*;
import java.util.*;

class Main {
    static int N, K;
    static int minSec = Integer.MAX_VALUE;
    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs();
        System.out.println(minSec);
    }

    public static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(N, 0));

        while(!queue.isEmpty()) {
            Node x = queue.poll();

            if(x.location == K) {
                minSec = Math.min(minSec, x.time);
            }

            if(x.location * 2 <= 100000 && !visited[x.location * 2]){
                queue.offer(new Node(x.location * 2, x.time));
                visited[x.location * 2] = true;
            }

            if(x.location - 1 >= 0 && !visited[x.location - 1]) {
                queue.offer(new Node(x.location - 1, x.time + 1));
                visited[x.location - 1] = true;
            }

            if(x.location + 1 <= 100000 && !visited[x.location + 1]) {
                queue.offer(new Node(x.location + 1, x.time + 1));
                visited[x.location + 1] = true;
            }
        }
    }

    static class Node {
        int location, time;

        Node(int location, int time) {
            this.location = location;
            this.time = time;
        }
    }
}