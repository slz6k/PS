import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }
        Arrays.sort(nums);
        boolean isSecond = false;
        int freq = 10000;
        int maxFre = 0;
        for(int i = 0 ; i < n; i++) {
            int count = 1;

            for(int j = i+1; j < n; j++){
                if(nums[i] != nums[j]) {
                    break;
                }
                count++;
            }

            if(count > maxFre) {
                maxFre = count;
                freq = nums[i];
                isSecond = true;
            }
            else if(count == maxFre && isSecond == true) {
                freq = nums[i];
                isSecond = false;
            }
            i += count-1;
        }
        sb.append((int)Math.round((double)sum/n)).append("\n");
        sb.append(nums[n/2]).append("\n");
        sb.append(freq).append("\n");
        sb.append(nums[n-1]-nums[0]);
        System.out.print(sb);
    }
}