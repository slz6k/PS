import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        while(n != -1) {
            String s = n + " = ";
            int sum = 0;
            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    s += i + " + ";
                    sum += i;
                }
            }
            if(sum == n) {
                sb.append(s.substring(0, s.length()-3)).append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
            n = Integer.parseInt(br.readLine());
        }
        System.out.print(sb);
    }
}