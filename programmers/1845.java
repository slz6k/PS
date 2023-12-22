import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> types = new HashSet<Integer>();
        for(int n : nums) {
            types.add(n);
        }

        if(types.size() >= nums.length/2) {
            answer = nums.length/2;
        } else {
            answer = types.size();
        }
        return answer;
    }
}