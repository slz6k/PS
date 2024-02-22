import java.io.*;
import java.util.*;

class Main {
    public static int L, C;
    public static char[] chars;
    public static char[] password;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        chars = new char[C];
        password = new char[L];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < C; i++) {
            chars[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(chars);

        makePassword(0, 0);
    }

    public static void makePassword(int index, int length) {
        if(length == L) {
            if(isValid()) {
                System.out.println(password);
            }
            return;
        }

        for(int i = index; i < C; i++) {
            password[length] = chars[i];
            makePassword(i+1, length+1);
        }
    }

    public static boolean isValid() {
        int vow = 0;
        int cons = 0;

        for(char c : password) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vow++;
            } else {
                cons++;
            }
        }

        if(vow >= 1 && cons >= 2) {
            return true;
        }

        return false;
    }
}