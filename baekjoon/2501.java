import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                nums.add(i);
            }
        }

        System.out.println((nums.size() < K)? 0 : nums.get(K-1));
    }
}