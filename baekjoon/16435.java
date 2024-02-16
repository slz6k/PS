import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] fruits = new int[N];
        for(int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(fruits);

        for(int fruit : fruits) {
            if(fruit <= L) {
                L++;
            } else {
                break;
            }
        }

        System.out.println(L);
    }
}