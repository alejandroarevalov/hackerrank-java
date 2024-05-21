package mathematics.fundamentals;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SummingTheNSeries {

    public static int summingSeries(long n) {
        BigInteger bigNumber = new BigInteger(String.valueOf(n));
        bigNumber = bigNumber.multiply(bigNumber);
        return bigNumber.mod(new BigInteger("1000000007")).intValue();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int testCases = console.nextInt();
        IntStream.range(0, testCases).forEach(testCase -> {
            long n = console.nextLong();
            System.out.println(summingSeries(n));
        });
        console.close();
    }
}
