import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> hs = new HashSet<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        while(N-- > 0) {
            hs.add(br.readLine());
        }
        int cnt = 0;
        while(M-- > 0) {
            if(hs.contains(br.readLine())) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}