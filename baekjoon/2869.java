import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int v = Integer.parseInt(inputs[2]);
        int day = (v-b) / (a-b);
        if((v-b) % (a-b) != 0) {
            day++;
        }

        System.out.println(day);
    }
}