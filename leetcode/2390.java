class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '*') {
                st.pop();
            } else {
                st.add(s.charAt(i));
            }
        }

        String answer = "";
        while(st.size() > 0) {
            answer = st.pop() + answer;
        }

        return answer;
    }
}