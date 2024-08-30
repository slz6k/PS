import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[10];

        String roomNum = br.readLine();

        for(char c : roomNum.toCharArray()) {
            int n = c - '0';
            if(n == 6) {
                if(cnt[9] < cnt[6]) {
                    cnt[9]++;
                } else {
                    cnt[6]++;
                }
            } else if(n == 9) {
                if(cnt[6] < cnt[9]) {
                    cnt[6]++;
                } else {
                    cnt[9]++;
                }
            } else {
                cnt[n]++;
            }
        }

        Arrays.sort(cnt);

        System.out.print(cnt[9]);
    }
}