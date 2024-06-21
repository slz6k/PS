class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);

        for (int i = 0; i < 31; i++) {
            int powOf2 = (int) Math.pow(2, i);
            char[] powOf2Digits = String.valueOf(powOf2).toCharArray();
            Arrays.sort(powOf2Digits);

            if (Arrays.equals(digits, powOf2Digits)) {
                return true;
            }
        }

        return false;
    }
}