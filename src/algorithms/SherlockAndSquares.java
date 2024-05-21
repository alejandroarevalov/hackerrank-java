package algorithms;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SherlockAndSquares {

    public static int squares(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            double sqrt = Math.sqrt(i);
            int sqrtInt = (int) sqrt;
            if ((sqrtInt * sqrtInt) == i) {
                count++;
                i = (sqrtInt + 1) * (sqrtInt + 1) - 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int testCases = console.nextInt();
        IntStream.range(0, testCases).forEach(index -> {
            int a = console.nextInt();
            int b = console.nextInt();
            System.out.println(squares(a, b));
        });
        console.close();
    }
}
