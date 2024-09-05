import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];
        for(int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);

        long max = -1;

        for(int i = 0; i < n; i++) {
            long w = (long) ropes[i] * (n - i);
            if(w > max) {
                max = w;
            }
        }

        System.out.print(max);
    }
}