import java.io.*;
import java.util.*;

class Main {
    static int N, M;
    static int[] nums;
    static int[] selected;
    static boolean[] visited;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        selected = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        dfs(0, 0);

        System.out.print(sb);
    }

    public static void dfs(int depth, int idx) {
        if(depth == M) {
            for(int num : selected) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        int prev = 0;
        for(int i = idx; i < N; i++) {
            if(!visited[i]) {
                if(prev == nums[i]) {
                    continue;
                }
                visited[i] = true;
                prev = nums[i];
                selected[depth] = nums[i];
                dfs(depth + 1, i);
                visited[i] = false;
            }
        }
    }
}