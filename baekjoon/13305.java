import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] distances = new long[N-1];
        long[] prices = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N-1; i++) {
            distances[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            prices[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minPrice = prices[0];
        for(int i = 0; i < N-1; i++) {
            if(minPrice > prices[i]) {
                minPrice = prices[i];
            }

            sum += minPrice * distances[i];
        }

        System.out.print(sum);
    }
}