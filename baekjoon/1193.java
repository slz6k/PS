import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int diagonal = 0;
        int sum = 0;

        while (sum < n) {
            diagonal++;
            sum += diagonal;
        }

        int position = n - (sum - diagonal);

        int numerator;
        int denominator;

        if (diagonal % 2 == 0) {
            numerator = position;
            denominator = diagonal - position + 1;
        } else {
            numerator = diagonal - position + 1;
            denominator = position;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
