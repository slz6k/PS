import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = br.readLine();
            if(s.equals(".")) {
                break;
            }

            if(isBalanced(s)) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[') {
                st.push(c);
            } else if(c == ')') {
                if(st.isEmpty()) {
                    return false;
                }
                if(st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if(c == ']') {
                if(st.isEmpty()) {
                    return false;
                }
                if(st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }

        if(st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}