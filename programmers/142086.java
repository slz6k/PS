class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphaIndex = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(alphaIndex[c-'a'] == -1)
                answer[i] = -1;
            else
                answer[i] = i - alphaIndex[c-'a'];
            alphaIndex[c-'a'] = i;
        }
        return answer;
    }
}