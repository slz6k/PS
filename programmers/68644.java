import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = hs.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}