import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue<Integer> q = new LinkedList<>();
        int last = 0;
        for(int i = 0; i < n; i++) {
            st= new StringTokenizer(br.readLine());
            String ins = st.nextToken();
            switch(ins) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    q.add(x);
                    last = x;
                    break;
                case "pop":
                    if(q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q.peek()).append("\n");
                        q.poll();
                    }
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty()? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(q.isEmpty()? -1 : q.peek()).append("\n");
                    break;
                case "back":
                    sb.append(q.isEmpty()? -1 : last).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}