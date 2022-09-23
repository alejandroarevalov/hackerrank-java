package various;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class FibonacciModified {

    public static String fibonacciModified(int t1, int t2, int n) {
        List<BigInteger> fiboValues = new ArrayList<>();
        fiboValues.add(0, BigInteger.valueOf(t1));
        fiboValues.add(1, BigInteger.valueOf(t2));
        for (int i = 2; i < n; i++) {
            BigInteger squared = fiboValues.get(i-1).multiply(fiboValues.get(i-1));
            fiboValues.add(i, fiboValues.get(i-2).add(squared));
        }
        return fiboValues.get(fiboValues.size()-1).toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(fibonacciModified(0, 1, 5));
        System.out.println(fibonacciModified(0, 1, 10));
    }
}
