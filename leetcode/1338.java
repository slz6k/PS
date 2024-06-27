class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int frequency : frequencyMap.values()) {
            maxHeap.add(frequency);
        }

        int removedElements = 0;
        int setSize = 0;
        int halfSize = arr.length / 2;

        while (removedElements < halfSize) {
            removedElements += maxHeap.poll();
            setSize++;
        }

        return setSize;
    }
}