import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long sum = 0;
        long cnt = 0;
        for(long i = 1; i <= 4294967295L; i++) {
            sum += i;
            cnt++;
            if(sum > s) {
                cnt--;
                break;
            }
        }

        System.out.println(cnt);
    }
}