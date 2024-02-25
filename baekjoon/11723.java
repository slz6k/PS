import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> hs = new HashSet<>();
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "add":
                    hs.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    hs.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    sb.append(hs.contains(Integer.parseInt(st.nextToken()))? 1 : 0).append("\n");
                    break;
                case "toggle":
                    int x = Integer.parseInt(st.nextToken());
                    if(hs.contains(x)) hs.remove(x);
                    else hs.add(x);
                    break;
                case "all":
                    hs = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
                    break;
                case "empty":
                    hs.clear();
                    break;
            }
        }

        System.out.println(sb);
    }
}