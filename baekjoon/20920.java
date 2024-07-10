import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] words = new String[N];
        Map<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < N; i++) {
            words[i] = br.readLine();
            hm.put(words[i], hm.getOrDefault(words[i], 0) + 1);
        }

        Comparator<String> com = new Comparator<>() {
            public int compare(String o1, String o2) {
                if(hm.get(o1) != hm.get(o2)) {
                    return hm.get(o2) - hm.get(o1);
                }

                if(o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }

                return o1.compareTo(o2);
            }
        };

        Arrays.sort(words, com);

        StringBuilder sb = new StringBuilder();
        Set<String> hs = new HashSet<>();
        for(String word : words) {
            if(!hs.contains(word) && word.length() >= M) {
                sb.append(word).append("\n");
                hs.add(word);
            }
        }

        System.out.print(sb);
    }
}