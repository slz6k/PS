import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> hm1 = new HashMap<>();
        Map<Integer, String> hm2 = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String pokemon;
        for(int i = 1; i <= N; i++) {
            pokemon = br.readLine();
            hm1.put(pokemon, i);
            hm2.put(i, pokemon);
        }

        for(int i = 0; i < M; i++) {
            pokemon = br.readLine();
            if(pokemon.charAt(0) >= 'A' && pokemon.charAt(0) <= 'Z') {
                sb.append(hm1.get(pokemon)).append("\n");
            } else {
                sb.append(hm2.get(Integer.parseInt(pokemon))).append("\n");
            }
        }

        System.out.println(sb);
    }
}