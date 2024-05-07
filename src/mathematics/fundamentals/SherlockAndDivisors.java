package mathematics.fundamentals;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SherlockAndDivisors {

    // Time limit Exceeded
    @Deprecated
    public static int divisorsConurrent(int n) {
        AtomicInteger divisorsCount = new AtomicInteger(0);
        IntStream.range(1, n + 1).forEach(divisor -> {
            if (n % divisor == 0 && divisor % 2 == 0) {
                divisorsCount.incrementAndGet();
            }
        });
        return divisorsCount.get();
    }

    public static int divisors(int n) {
        int divisorsCount = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int divisor = n / i;
                if (i % 2 == 0) {
                    divisorsCount++;
                }
                if (divisor % 2 == 0 && i != divisor) {
                    divisorsCount++;
                }
            }
        }
        return divisorsCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        IntStream.range(0, testCases).forEach(index -> {
            System.out.println(divisors(scanner.nextInt()));
        });
        scanner.close();
    }
}
