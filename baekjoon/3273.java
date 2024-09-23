import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        Arrays.sort(nums);
        int cnt = 0;
        int r = n - 1;
        int l = 0;
        while(l < r) {
            int sum = nums[l] + nums[r];
            if(sum == x) {
                cnt++;
                l++;
                r--;
            } else if (sum < x) {
                l++;
            } else {
                r--;
            }
        }

        System.out.print(cnt);
    }
}