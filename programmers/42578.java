import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            if(hm.containsKey(type)) {
                hm.put(type, hm.get(type)+1);
            } else {
                hm.put(type, 2);
            }
        }

        for(int value : hm.values()) {
            answer *= value;
        }

        return (answer - 1);
    }
}