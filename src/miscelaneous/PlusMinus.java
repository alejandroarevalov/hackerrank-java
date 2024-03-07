package miscelaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(List<Integer> elementsList) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.get(i) > 0) {
                positives++;
            } else if (elementsList.get(i) < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        System.out.printf("%.6f\n", positives * 1.0 / elementsList.size());
        System.out.printf("%.6f\n", negatives * 1.000000 / elementsList.size());
        System.out.printf("%.6f\n", zeros * 1.000000 / elementsList.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        List<Integer> elements = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            elements.add(scanner.nextInt());
        }
        plusMinus(elements);
    }
}
