import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for(int i = k; i < n; i++) {
            sum += nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}