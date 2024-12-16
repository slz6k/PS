import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int[] counts = new int[26];
        for(char c : name.toCharArray()) {
            counts[c - 'A']++;
        }

        int odd = 0;
        char oddChar = '\0';
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < 26; i++) {
            if(counts[i] % 2 == 1) {
                odd++;
                oddChar = (char) ('A' + i);
            }
            for(int j = 0; j < counts[i] / 2; j++) {
                sb.append((char) ('A' + i));
            }
        }

        StringBuffer answer = new StringBuffer(sb);
        if(odd > 1) {
            answer = new StringBuffer("I'm Sorry Hansoo");
        } else {
            if(odd == 1) {
                answer.append(oddChar);
            }
            answer.append(sb.reverse());
        }

        System.out.print(answer);
    }
}