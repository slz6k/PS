import java.io.*;
import java.util.*;

class Main {
    static int[] nums;
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[m];
        dfs(0);

        System.out.print(sb);
    }

    public static void dfs(int depth) {
        if(depth == m) {
            for(int num : nums) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < n; i++) {
            nums[depth] = i + 1;
            if(depth > 0) {
                if(nums[depth] < nums[depth-1]) {
                    continue;
                }
            }
            dfs(depth + 1);
        }
    }
}