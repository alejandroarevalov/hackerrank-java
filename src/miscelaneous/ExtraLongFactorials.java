package miscelaneous;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        extraLongFactorials(n);
    }
}
