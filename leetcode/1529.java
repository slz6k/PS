class Solution {
    public int minFlips(String target) {
        int flips = 0;
        char current = '0';

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != current) {
                flips++;
                current = target.charAt(i);
            }
        }

        return flips;
    }
}