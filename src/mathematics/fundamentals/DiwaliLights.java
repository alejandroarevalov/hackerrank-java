package mathematics.fundamentals;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DiwaliLights {

    public static long lights(int n) {
        BigInteger combinations = BigInteger.TWO
                .pow(n)
                .subtract(BigInteger.ONE);
        return combinations.mod(BigInteger.valueOf(100000)).longValue();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        IntStream.range(0, testCases).forEach(index -> {
            int input = scanner.nextInt();
            System.out.println(lights(input));
        });
        scanner.close();
    }
}
