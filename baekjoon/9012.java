import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++) {
            String p = scanner.next();
            if(isPS(p)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPS(String p) {
        Stack<Character> parenthesis = new Stack<>();
        for(int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if(c == '(') {
                parenthesis.push(c);
            } else {
                if(parenthesis.isEmpty()) {
                    return false;
                } else {
                    parenthesis.pop();
                }
            }
        }

        if(parenthesis.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}