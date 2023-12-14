import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int i = 1;
        String prev = words[0];
        Set<String> prevWords = new HashSet<>();
        prevWords.add(prev);

        for(; i < words.length; i++) {
            if(!prevWords.add(words[i])) {
                break;
            }
            if(prev.charAt(prev.length()-1) != words[i].charAt(0)) {
                break;
            }

            prev = words[i];
        }

        if(i == words.length)
            return new int[] {0, 0};

        answer[0] = i % n + 1;
        answer[1] = i / n + 1;
        return answer;
    }
}