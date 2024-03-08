import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ex = br.readLine().split("-");
        int sum = 0;
        for(int i = 0; i < ex.length; i++) {
            int n = 0;
            if(ex[i].contains("+")) {
                String[] plus = ex[i].split("\\+");
                for(int j = 0; j < plus.length; j++) {
                    n += Integer.parseInt(plus[j]);
                }
            } else {
                n = Integer.parseInt(ex[i]);
            }

            if(i == 0) {
                sum += n;
            } else {
                sum -= n;
            }
        }

        System.out.println(sum);
    }
}