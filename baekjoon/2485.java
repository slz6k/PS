import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];
        int[] btw = new int[n-1];

        for(int i = 0; i < n; i++) {
            trees[i]= Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n-1; i++) {
            btw[i] = trees[i+1] - trees[i];
        }

        int x = gcd(btw);
        int sum = 0;
        for(int b : btw) {
            sum += (b / x) - 1;
        }

        System.out.println(sum);
    }

    public static int gcd(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}