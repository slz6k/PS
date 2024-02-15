import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(Integer.parseInt(st.nextToken())) {
                case(1):
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case(2):
                    if(stack.isEmpty()) {
                        sb.append(-1 + "\n");
                        break;
                    } else {
                        sb.append(stack.pop() + "\n");
                        break;
                    }
                case(3):
                    sb.append(stack.size() + "\n");
                    break;
                case(4):
                    if(stack.isEmpty()) {
                        sb.append(1 + "\n");
                        break;
                    } else {
                        sb.append(0 + "\n");
                        break;
                    }
                case(5):
                    if(stack.isEmpty()) {
                        sb.append(-1 + "\n");
                        break;
                    } else {
                        sb.append(stack.peek() + "\n");
                        break;
                    }
            }
        }
        System.out.print(sb);
    }
}

// 스택 2