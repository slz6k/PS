class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String bin1 = toBinary(n, arr1[i]);
            String bin2 = toBinary(n, arr2[i]);
            answer[i] = orOperation(bin1, bin2);
        }
        return answer;
    }

    public String toBinary(int n, int num) {
        String bin = Integer.toBinaryString(num);
        if(bin.length() != n) {
            bin = "0".repeat(n-bin.length()) + bin;
        }
        return bin;
    }

    public String orOperation(String bin1, String bin2) {
        String str = "";
        for(int i = 0; i < bin1.length(); i++) {
            if(bin1.charAt(i) == '1' || bin2.charAt(i) == '1') {
                str += "#";
            } else {
                str += " ";
            }
        }
        return str;
    }
}