package miscelaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long min = 1L * arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3);
        long max = 1L * arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4);
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elements.add(scanner.nextInt());
        }
        miniMaxSum(elements);
    }
}
