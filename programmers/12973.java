import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> couples = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(couples.isEmpty()) {
                couples.push(c);
            } else {
                if(couples.peek() == c) {
                    couples.pop();
                } else {
                    couples.push(c);
                }
            }
        }

        if(couples.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}