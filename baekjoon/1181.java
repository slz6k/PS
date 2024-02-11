import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            if(!words.contains(word)) {
                words.add(word);
            }
        }

        Comparator<String> comparator= (s1, s2) -> {
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        };

        Collections.sort(words, comparator);

        for(int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

    }
}