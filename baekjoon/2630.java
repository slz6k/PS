import java.io.*;
import java.util.*;

class Main {
    public static int white = 0, blue = 0;
    public static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(0, 0, N);
        System.out.println(white);
        System.out.print(blue);
    }

    public static void partition(int row, int col, int size) {
        if(colorCheck(row, col, size)) {
            if(board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        size /= 2;
        partition(row, col, size);
        partition(row, col + size, size);
        partition(row + size, col, size);
        partition(row + size, col + size, size);
    }

    public static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}