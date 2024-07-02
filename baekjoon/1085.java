import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = 1000;

        if(x < min) {
            min = x;
        }

        if(y < min) {
            min = y;
        }

        if(w - x < min) {
            min = w - x;
        }

        if(h - y < min) {
            min = h - y;
        }

        System.out.println(min);
    }
}