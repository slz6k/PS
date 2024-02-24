import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 1; i <= N; i++) {
            String s = Integer.toString(i);
            int M = i;
            for(int x = 0; x < s.length(); x++) {
                M += Character.getNumericValue(s.charAt(x));
            }

            if(M == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}