import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long X = Long.parseLong(input[0]);
        long Y = Long.parseLong(input[1]);
        long Z = (Y * 100) / X;

        long answer = -1;
        long left = 0;
        long right = 1000000000;

        while(left <= right) {
            long mid = (left + right) / 2;
            if(((Y + mid) * 100) / (X + mid) != Z) {
                answer = mid;
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }

        System.out.print(answer);
    }
}