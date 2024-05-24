import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int s : scoville) {
            minHeap.offer(s);
        }
        while(minHeap.peek() < K && minHeap.size() > 1) {
            minHeap.add(minHeap.poll() + (minHeap.poll() * 2));
            answer++;
        }

        if(minHeap.peek() < K) {
            return -1;
        }

        return answer;
    }
}