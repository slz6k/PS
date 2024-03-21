import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 1; i <= n; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        int index = 0;
        while(list.size() > 1) {
            index = (index + (k - 1)) % n;
            sb.append(list.remove(index)).append(", ");
            n--;
        }

        sb.append(list.remove()).append('>');
        System.out.print(sb);
    }
}