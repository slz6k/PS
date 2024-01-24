import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int one = 0, two = 0, three = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == answer1[i%answer1.length])
                one++;
            if(answers[i] == answer2[i%answer2.length])
                two++;
            if(answers[i] == answer3[i%answer3.length])
                three++;
        }

        int max = Math.max(one, Math.max(two, three));
        List<Integer> answer = new ArrayList<>();
        if(max == one)
            answer.add(1);
        if(max == two)
            answer.add(2);
        if(max == three)
            answer.add(3);
        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}