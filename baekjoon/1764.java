import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> hs = new HashSet<>();
        List<String> al = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            hs.add(br.readLine());
        }

        for(int i = 0; i < M; i++) {
            String name = br.readLine();
            if(hs.contains(name)) {
                al.add(name);
            }
        }
        Collections.sort(al);

        sb.append(al.size()).append("\n");
        for(int i = 0; i < al.size(); i++) {
            sb.append(al.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}