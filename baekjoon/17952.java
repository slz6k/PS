import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<int[]> homeworks = new ArrayList<>();
        int score = 0;
        int present = -1;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("1")) {
                int[] homework = new int[2];
                homework[0] = Integer.parseInt(st.nextToken());
                homework[1] = Integer.parseInt(st.nextToken()) - 1;
                homeworks.add(homework);
                present++;
            } else {
                if(!homeworks.isEmpty()) {
                    homeworks.get(present)[1]--;
                }
            }

            if(!homeworks.isEmpty()) {
                if(homeworks.get(present)[1] == 0) {
                    score += homeworks.get(present)[0];
                    homeworks.remove(present);
                    present--;
                }
            }
        }

        System.out.println(score);
    }
}