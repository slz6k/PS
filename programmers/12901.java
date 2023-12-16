class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int day = b;
        for(int m = 1; m < a; m++) {
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
                day += 31;
            else if(m == 2)
                day += 29;
            else
                day += 30;
        }

        answer = days[day % 7];
        return answer;
    }
}