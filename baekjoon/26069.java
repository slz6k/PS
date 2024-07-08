import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<String> dancers = new HashSet<String>();
        dancers.add("ChongChong");
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            if(dancers.contains(A) || dancers.contains(B)) {
                dancers.add(A);
                dancers.add(B);
            }
        }

        System.out.println(dancers.size());
    }
}