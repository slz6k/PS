class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        List<Integer> frequencies = new ArrayList<>(hm.keySet());
        frequencies.sort((a, b) -> hm.get(b) - hm.get(a));

        int[] answer = new int[k];
        for(int i = 0; i < k; i++) {
            answer[i] = frequencies.get(i);
        }

        return answer;
    }
}