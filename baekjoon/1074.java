import java.io.*;
import java.util.*;

class Main {
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, N);

        partition(r, c, size);
        System.out.print(count);
    }

    public static void partition(int row, int col, int size) {
        if(size == 1)
            return;

        if(row < size / 2 && col < size / 2) {
            partition(row, col, size / 2);
        }
        else if(row < size / 2 && col >= size / 2) {
            count += size * size / 4;
            partition(row, col - size / 2, size / 2);
        }
        else if(row >= size / 2 && col < size / 2) {
            count += (size * size / 4) * 2;
            partition(row - size / 2, col, size / 2);
        }
        else {
            count += (size * size / 4) * 3;
            partition(row - size / 2, col - size / 2, size / 2);
        }
    }

}