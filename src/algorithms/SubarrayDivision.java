package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDivision {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */
    public static int birthday(List<Integer> s, int d, int m) {
        int totalDivisions = 0;
        for (int i = 0; i < s.size() - m + 1; i++) {
            int j = i;
            int partialSum = 0;
            while(j < m + i) {
                partialSum += s.get(j);
                j++;
            }
            if (partialSum == d) {
                totalDivisions++;
            }
        }
        return totalDivisions;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList<Integer> elements = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            elements.add(scanner.nextInt());
        }
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        scanner.close();
        System.out.println(birthday(elements, day, month));
    }
}
