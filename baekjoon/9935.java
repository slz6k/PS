import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        String b = br.readLine();
        int bLen = b.length();
        Stack<Character> st = new Stack<>();

        for(char c : a) {
            st.push(c);

            if(st.size() >= bLen) {
                boolean isMatch = true;

                for(int i = 0; i < bLen; i++) {
                    if(st.get(st.size() - bLen + i) != b.charAt(i)) {
                        isMatch = false;
                        break;
                    }
                }

                if(isMatch) {
                    for(int i = 0; i < bLen; i++) {
                        st.pop();
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : st) {
            sb.append(c);
        }
        System.out.print((sb.length() == 0) ? "FRULA" : sb);
    }
}