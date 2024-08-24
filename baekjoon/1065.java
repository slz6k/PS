import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 1; i <= n ; i++) {
            if(isHanNum(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isHanNum(int n) {
        String numStr = Integer.toString(n);

        if(numStr.length() < 3) {
            return true;
        }

        int diff = (numStr.charAt(0) - '0') - (numStr.charAt(1) - '0');

        for(int i = 1; i < numStr.length() - 1; i++) {
            int currentDiff = (numStr.charAt(i) - '0') - (numStr.charAt(i+1) - '0');
            if(diff != currentDiff) {
                return false;
            }
        }

        return true;
    }
}