class Solution {
    public int solution(int n) {
        return Integer.parseInt(toThree(n), 3);
    }
    public String toThree(int n) {
        String threeString = "";
        while(n > 0) {
            threeString += Integer.toString(n % 3);
            n /= 3;
        }
        return threeString;
    }
}