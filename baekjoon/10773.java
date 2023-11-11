import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int k = scanner.nextInt();
        for(int i = 0; i < k; i++) {
            int n = scanner.nextInt();
            if(n == 0) {
                stack.pop();
            }
            else {
                stack.push(n);
            }
        }

        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}