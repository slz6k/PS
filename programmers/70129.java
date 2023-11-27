class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int change = 0;
        int zero = 0;
        while(!s.equals("1")) {
            zero += s.length() - s.replace("0", "").length();
            s = Integer.toBinaryString(s.replace("0", "").length());
            change++;
        }
        answer[0] = change;
        answer[1] = zero;
        return answer;
    }
}