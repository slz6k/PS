import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> hs = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        int gomgom = 0;
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.equals("ENTER")) {
                gomgom += hs.size();
                hs.clear();
            } else {
                hs.add(s);
            }
        }
        gomgom += hs.size();
        System.out.println(gomgom);
    }
}