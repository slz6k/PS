import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> answer = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }
        for(int x : A) {
            if(!B.contains(x)) {
                answer.add(x);
            }
        }
        for(int x : B) {
            if(!A.contains(x)) {
                answer.add(x);
            }
        }
        System.out.print(answer.size());
    }
}