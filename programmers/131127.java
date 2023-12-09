import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int i = 0; i < discount.length - 9; i++) {
            int[] temp = number.clone();
            boolean possible = true;
            for(int j = 0; j < 10; j++) {
                if(Arrays.asList(want).contains(discount[i+j])) {
                    temp[Arrays.asList(want).indexOf(discount[i+j])]--;
                }
            }
            for(int t : temp) {
                if(t != 0) {
                    possible = false;
                }
            }
            if(possible) answer++;
        }
        return answer;
    }
}