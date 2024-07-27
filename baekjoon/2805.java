import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] trees = new int[n];
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if(trees[i] > max) {
                max = trees[i];
            }
        }

        int answer = 0;
        int high = max;
        int low = 0;

        while(low <= high) {
            int mid = (low + high) / 2;
            long total = 0;
            for(int tree : trees) {
                if(tree > mid) {
                    total += tree - mid;
                }
            }
            if(total >= m) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(answer);
    }
}