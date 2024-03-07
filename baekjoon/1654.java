import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] lines = new int[K];
        long right = 0, left = 1, mid = 0;
        long result = 0;
        for(int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            if(lines[i] > right) {
                right = lines[i];
            }
        }

        while(left <= right) {
            long count = 0;
            mid = (right + left) / 2;
            for(int line : lines) {
                count += (line / mid);
            }

            if(count < N) {
                right = mid - 1;
            } else {
                result = mid;
                left = mid + 1;
            }
        }

        System.out.println(result);
    }
}