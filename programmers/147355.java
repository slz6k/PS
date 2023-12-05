class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String sub;
        for(int i = 0; i <= t.length() - p.length(); i++) {
            sub = "";
            for(int j = 0; j < p.length(); j++) {
                sub += t.charAt(i+j);
            }
            if(Long.parseLong(sub) <= Long.parseLong(p))
                answer++;
        }

        return answer;
    }
}