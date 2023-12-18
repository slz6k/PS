import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int total = score.length;
        Arrays.sort(score);
        while(total >= m) {
            answer += score[total - m] * m;
            total -= m;
        }

        return answer;
    }
}