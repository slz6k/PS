class SeatManager {
    PriorityQueue<Integer> minHeap;

    public SeatManager(int n) {
        minHeap = new PriorityQueue<>();
        for(int i = 1; i <= n; i++) {
            minHeap.add(i);
        }
    }

    public int reserve() {
        return minHeap.poll();
    }

    public void unreserve(int seatNumber) {
        minHeap.add(seatNumber);
    }
}