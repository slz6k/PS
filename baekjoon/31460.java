import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();

            if (N == 1) {
                System.out.println(0);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(1);
                for (int i = 0; i < N - 2; i++) {
                    sb.append(2);
                }
                sb.append(1);

                System.out.println(sb.toString());
            }
        }

        scanner.close();
    }
}