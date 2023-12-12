class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                if(sizes[i][0] > hMax)
                    hMax = sizes[i][0];
                if(sizes[i][1] > wMax)
                    wMax = sizes[i][1];
            } else {
                if(sizes[i][1] > hMax)
                    hMax = sizes[i][1];
                if(sizes[i][0] > wMax)
                    wMax = sizes[i][0];
            }
        }
        return wMax * hMax;
    }
}