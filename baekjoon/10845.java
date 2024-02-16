import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s) {
                case "push":
                    numbers.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(numbers.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(numbers.get(0)).append("\n");
                        numbers.remove(numbers.get(0));
                    }
                    break;
                case "size":
                    sb.append(numbers.size()).append("\n");
                    break;
                case "empty":
                    sb.append(numbers.isEmpty()? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(numbers.isEmpty()? -1 : numbers.get(0)).append("\n");
                    break;
                case "back":
                    sb.append(numbers.isEmpty()? -1 : numbers.get(numbers.size()-1)).append("\n");
                    break;
                default:break;
            }
        }
        System.out.println(sb);
    }
}