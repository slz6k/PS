import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        while(true) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            boolean isP = true;
            if(s.equals("0")) {
                break;
            }

            for(int i = 0; i < s.length() / 2; i++) {
                if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                    isP = false;
                }
            }

            if(isP) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
    }
}