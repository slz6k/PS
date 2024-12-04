import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> cards = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(br.readLine()));
        }

        long result = 0;
        while(cards.size() > 1) {
            int cnt = cards.poll() + cards.poll();
            result += cnt;
            cards.add(cnt);
        }

        System.out.print(result);
    }
}