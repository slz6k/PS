class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> friends = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            friends.add(i);
        }

        int now = 0;
        while(friends.size() > 1) {
            now = (now + k - 1) % friends.size();
            friends.remove(now);
        }

        return friends.get(0);
    }
}