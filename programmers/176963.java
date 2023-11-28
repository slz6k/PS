import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0 ; i < photo.length; i++) {
            for(String s : photo[i]) {
                int index = Arrays.asList(name).indexOf(s);
                if(index > -1) {
                    answer[i] += yearning[index];
                }
            }
        }
        return answer;
    }
}