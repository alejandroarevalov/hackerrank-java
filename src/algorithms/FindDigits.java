package algorithms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindDigits {

    public static int findDigits(int n) {
        char[] s = String.valueOf(n).toCharArray();
        int result = 0;
        for (Character c : s) {
            int potential = Integer.parseInt(String.valueOf(c));
            if (potential != 0 && n % potential == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        IntStream.range(0, t).forEach(testCase ->
                System.out.println(findDigits(scanner.nextInt()))
        );
    }
}
