import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] lines = new int[K];
        long max = 0, min = 0, mid = 0;
        for(int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            if(lines[i] > max) {
                max = lines[i];
            }
        }
        max++;
        while(min < max) {
            long count = 0;
            mid = (max + min) / 2;
            for(int line : lines) {
                count += (line / mid);
            }

            if(count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min-1);
    }
}