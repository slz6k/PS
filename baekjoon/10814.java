import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer[] members = new StringBuffer[201];
        for(int i = 0; i < 201; i++) {
            members[i] = new StringBuffer();
        }

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuffer sb = new StringBuffer();
        for(StringBuffer member : members) {
            sb.append(member);
        }
        System.out.print(sb);
    }
}