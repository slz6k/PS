import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] cp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            num[i] = cp[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cp);
        Map<Integer, Integer> hm = new HashMap<>();
        int index = 0;
        for(int i = 0; i < N; i++) {
            if(!hm.containsKey(cp[i])) {
                hm.put(cp[i], index);
                index++;
            }
        }
        for(int i = 0; i < N; i++) {
            sb.append(hm.get(num[i])).append(" ");
        }
        System.out.print(sb);
    }
}