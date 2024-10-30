import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        while(T-- > 0) {
            long N = Long.parseLong(br.readLine());
            long left = 0;
            long right = (long) Math.sqrt(2 * N);
            long answer = 0;

            while(left <= right) {
                long mid = (left + right) / 2;
                long sum = mid * (mid + 1) / 2;

                if(sum  <= N) {
                    answer = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}