class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int prev = 0; // 이전 공격 시점
        int continuity = 0; // 연속 치료 시간
        for(int i = 0; i < attacks.length; i++) {
            continuity = attacks[i][0] - prev - 1;
            if(continuity > 0) {
                answer += continuity * bandage[1];
                answer += bandage[2] * (continuity / bandage[0]);
            }
            if(answer > health) {
                answer = health;
            }

            answer -= attacks[i][1];
            if(answer <= 0){
                return -1;
            }

            continuity = 0;
            prev = attacks[i][0];
        }
        return answer;
    }
}