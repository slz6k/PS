import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] lineString = br.readLine().split(" ");
        int[] line = new int[N];
        for(int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(lineString[i]);
        }

        Stack<Integer> stack = new Stack<>();
        int present = 1;
        for(int i = 0; i < N; i++) {
            if(line[i] == present) {
                present++;
            } else {
                stack.push(line[i]);
            }

            while(!stack.isEmpty() && stack.peek() == present) {
                stack.pop();
                present++;
            }
        }

        if(stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}