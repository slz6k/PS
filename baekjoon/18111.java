import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int max = 0;
        int min = 256;

        int[][] ground = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                if(ground[i][j] > max) {
                    max = ground[i][j];
                }
                if(ground[i][j] < min) {
                    min = ground[i][j];
                }
            }
        }

        int minTime = 99999999;
        int height = 0;
        for(int h = min; h <= max; h++) {
            int temp = B;
            int time = 0;
            for(int i = 0; i < N; i++) {
                int block = 0;
                for(int j = 0; j < M; j++) {
                    if(ground[i][j] < h) {
                        block = h - ground[i][j];
                        temp -= block;
                        time += block;
                    } else {
                        block = ground[i][j] - h;
                        temp += block;
                        time += (block * 2);
                    }
                }
            }
            if(temp >= 0) {
                if(time <= minTime) {
                    minTime = time;
                    height = h;
                }
            }
        }

        System.out.print(minTime + " " + height);
    }
}