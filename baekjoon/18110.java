import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        int avg = (int) Math.round(n*0.15);
        double sum = 0.0;
        for(int i = avg; i < n-avg; i++) {
            sum += nums[i];
        }
        System.out.print((int) Math.round(sum/(n-(avg*2))));
    }
}