package mathematics.combinatorics;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class KCandyStore {

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
    public static int solve(int n, int k) {
        return calculateNCR(n + k - 1, k);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int testCases = console.nextInt();
        IntStream.range(0, testCases).forEach(index -> {
            int n = console.nextInt();
            int k = console.nextInt();
            System.out.println(solve(n, k));
        });
        console.close();
    }
}
