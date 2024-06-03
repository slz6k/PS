import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Set<String> hs = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                hs.add(s.substring(i, j+1));
            }
        }
        System.out.print(hs.size());
    }
}