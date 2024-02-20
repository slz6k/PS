import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        List<Integer> deque = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case("push_front"):
                    deque.add(0, Integer.parseInt(st.nextToken()));
                    break;
                case("push_back"):
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;
                case("pop_front"):
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.get(0)).append("\n");
                        deque.remove(0);
                    }
                    break;
                case("pop_back"):
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.get(deque.size()-1)).append("\n");
                        deque.remove(deque.size()-1);
                    }
                    break;
                case("size"):
                    sb.append(deque.size()).append("\n");
                    break;
                case("empty"):
                    sb.append(deque.isEmpty()? 1 : 0).append("\n");
                    break;
                case("front"):
                    sb.append(deque.isEmpty()? -1 : deque.get(0)).append("\n");
                    break;
                case("back"):
                    sb.append(deque.isEmpty()? -1 : deque.get(deque.size()-1)).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}