import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Set<String> hs = new HashSet<>();
        while(N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String input = st.nextToken();
            if(input.equals("enter")) {
                hs.add(name);
            } else {
                hs.remove(name);
            }
        }
        List<String> names = new ArrayList<>(hs);
        names.sort(Comparator.reverseOrder());
        for(String s : names) {
            System.out.println(s);
        }
    }
}