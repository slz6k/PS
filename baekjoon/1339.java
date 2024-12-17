import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] weights = new int[26];

        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            int len = word.length();
            for(int j = 0; j < len; j++) {
                char c = word.charAt(j);
                weights[c - 'A'] += (int) Math.pow(10, len - j - 1);
            }
        }

        Arrays.sort(weights);
        int sum = 0;
        int num = 9;
        for(int i = 25; i >= 0; i--) {
            sum += weights[i] * num;
            num--;
        }

        System.out.print(sum);
    }
}