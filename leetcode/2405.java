class Solution {
    public int partitionString(String s) {
        Set<Character> partition = new HashSet<>();
        int cnt = 0;

        for(char c : s.toCharArray()) {
            if(partition.contains(c)) {
                cnt++;
                partition.clear();
            }
            partition.add(c);
        }

        cnt++;

        return cnt;
    }
}