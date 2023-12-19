import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> tangerineMap = new HashMap<>();
        for(int t : tangerine) {
            if(tangerineMap.containsKey(t)) {
                tangerineMap.put(t, tangerineMap.get(t) + 1);
            } else {
                tangerineMap.put(t, 1);
            }
        }
        List<Integer> tangerineValues = new ArrayList<>(tangerineMap.values());
        tangerineValues.sort(Comparator.reverseOrder());
        for(int i = 0; i < tangerineValues.size(); i++) {
            answer++;
            k -= tangerineValues.get(i);
            if(k <= 0) {
                break;
            }
        }
        return answer;
    }
}