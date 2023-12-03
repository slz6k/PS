import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        int min = score[0];
        List<Integer> wholeOfFames = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(wholeOfFames.size() >= k) {
                if(wholeOfFames.get(0) < score[i]) {
                    wholeOfFames.remove(0);
                    wholeOfFames.add(score[i]);
                }
            } else {
                wholeOfFames.add(score[i]);
            }
            Collections.sort(wholeOfFames);
            answer[i] = wholeOfFames.get(0);
        }
        return answer;
    }
}