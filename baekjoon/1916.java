import java.io.*;
import java.util.*;

class Bus implements Comparable<Bus>{
    int destination, price;

    Bus(int destination, int price) {
        this.destination = destination;
        this.price = price;
    }

    @Override
    public int compareTo(Bus b) {
        return price - b.price;
    }
}

class Main {
    static int N, M;
    static ArrayList<Bus>[] buses;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        buses = new ArrayList[N+1];
        visited = new boolean[N+1];
        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i = 1; i <= N; i++) {
            buses[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            buses[start].add(new Bus(end, w));
        }

        st = new StringTokenizer(br.readLine());

        int startCity = Integer.parseInt(st.nextToken());
        int endCity = Integer.parseInt(st.nextToken());

        dijkstra(startCity);

        System.out.print(dist[endCity]);
    }

    private static void dijkstra(int startCity) {
        PriorityQueue<Bus> pq = new PriorityQueue<>();
        pq.offer(new Bus(startCity, 0));
        dist[startCity] = 0;

        while(!pq.isEmpty()) {
            Bus currentBus = pq.poll();
            int currentDestination = currentBus.destination;

            if(!visited[currentDestination]) {
                visited[currentDestination] = true;

                for(Bus b : buses[currentDestination]) {
                    if(!visited[b.destination] && dist[b.destination] > (dist[currentDestination] + b.price)) {
                        dist[b.destination] = dist[currentDestination] + b.price;
                        pq.offer(new Bus(b.destination, dist[b.destination]));
                    }
                }
            }
        }
    }
}