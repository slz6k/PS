import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] times = new int[N];
        for(int i = 0; i < N; i++) {
            times[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(times);

        int prev = 0;
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += prev + times[i];
            prev += times[i];
        }

        System.out.println(sum);
    }
}