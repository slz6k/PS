import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = N / 5;
        int b = (N - (a * 5)) / 3;
        boolean possible = false;
        while(a >= 0) {
            if((a*5) + (b*3) == N) {
                possible = true;
                break;
            }
            a--;
            b = (N - (a * 5)) / 3;
        }

        if(possible) {
            System.out.println(a+b);
        } else {
            System.out.println(-1);
        }
    }
}