import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= 10000; i++) {
            nums.add(i);
        }

        for(int i = 1; i <= 10000; i++) {
            int d = i;
            for(char c : Integer.toString(i).toCharArray()) {
                d += c - '0';
            }
            nums.remove(Integer.valueOf(d));
        }

        for(int n : nums) {
            System.out.println(n);
        }
    }
}