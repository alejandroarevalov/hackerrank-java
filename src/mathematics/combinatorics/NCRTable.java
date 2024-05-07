package mathematics.combinatorics;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NCRTable {

    private static final HashMap<Point, Integer> nCrValues;

    static {
        nCrValues = new HashMap<>();
        nCrValues.put(new Point(0, 0), 1);
        nCrValues.put(new Point(1, 0), 1);
        nCrValues.put(new Point(1, 1), 1);
        nCrValues.put(new Point(2, 0), 1);
        nCrValues.put(new Point(2, 1), 2);
        nCrValues.put(new Point(2, 2), 1);
        nCrValues.put(new Point(3, 0), 1);
        nCrValues.put(new Point(3, 1), 3);
        nCrValues.put(new Point(3, 2), 3);
        nCrValues.put(new Point(3, 3), 1);
        nCrValues.put(new Point(4, 0), 1);
        nCrValues.put(new Point(4, 1), 4);
        nCrValues.put(new Point(4, 2), 6);
        nCrValues.put(new Point(4, 3), 4);
        nCrValues.put(new Point(4, 4), 1);
    }

    public static int calculateNCR(int n, int r) {
        Point p = new Point(n, r);
        int result;
        if (nCrValues.containsKey(p)) {
            result = nCrValues.get(p);
        } else {
            if (n == 0 || r == 0 || n == r) {
                result = 1;
            } else if (r == 1) {
                result = n;
            } else {
                result = (calculateNCR(n - 1, r - 1) + calculateNCR(n - 1, r)) % 1000000000;
                nCrValues.put(p, result);
            }
        }
        return result;
    }

    public static List<Integer> solveNCRTable(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            numbers.add(calculateNCR(n, i));
        }
        return numbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int testCases = scanner.nextInt();
        IntStream.range(0, testCases).forEach(index -> {
            List<Integer> resultsList = solveNCRTable(scanner.nextInt());
            resultsList.forEach(element -> {
                str.append(element);
                str.append(" ");
            });
            str.deleteCharAt(str.length() - 1);
            System.out.println(str);
            str.delete(0, str.length());
        });
    }
}
