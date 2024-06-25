class Solution {
    public int minAddToMakeValid(String s) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                st.add('(');
            } else {
                if(st.isEmpty()) {
                    answer++;
                } else {
                    st.pop();
                }
            }
        }
        answer += st.size();
        return answer;
    }
}