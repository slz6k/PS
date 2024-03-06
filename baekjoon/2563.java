import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        boolean[][] squares = new boolean[101][101];
        int sum = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int x = a; x < a+10; x++) {
                for(int y = b; y < b+10; y++) {
                    if(!squares[x][y]) {
                        squares[x][y] = true;
                        sum++;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}