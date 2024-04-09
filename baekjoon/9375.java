import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> hm = new HashMap<>();
            while(N-- > 0) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                if(hm.containsKey(type)) {
                    hm.put(type, hm.get(type)+1);
                } else {
                    hm.put(type, 2);
                }
            }
            List<String> keyList = new ArrayList<>(hm.keySet());
            int count = 1;
            for(String s : keyList) {
                count *= hm.get(s);
            }
            sb.append(count-1).append("\n");
        }
        System.out.print(sb);
    }
}