import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        long M = Long.parseLong(br.readLine());

        int left = 0;
        int right = nums[N-1];
        int answer = 0;

        while(left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;

            for(int num : nums) {
                sum += Math.min(num, mid);
            }

            if(sum > M) {
                right = mid - 1;
            } else {
                answer = mid;
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }
}