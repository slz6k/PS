class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0) {
            answer = sumSquare(n);
        } else {
            answer = sumOdd(n);
        }
        return answer;
    }

    public int sumSquare(int n) {
        int sum = 0;
        for(int i = 2; i <= n; i += 2) {
            sum += (i*i);
        }
        return sum;
    }

    public int sumOdd(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}