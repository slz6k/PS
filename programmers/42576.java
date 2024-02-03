import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String s : participant) {
            if(map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count+1);
            } else {
                map.put(s, 1);
            }
        }

        for(String s: completion) {
            if(map.get(s) == 1) {
                map.remove(s);
            } else {
                map.put(s, map.get(s)-1);
            }
        }

        answer = List.copyOf(map.keySet()).get(0);
        return answer;
    }
}