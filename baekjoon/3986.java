import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(N-- > 0) {
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(char c : word.toCharArray()) {
                if(!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }
            if(stack.isEmpty()) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}