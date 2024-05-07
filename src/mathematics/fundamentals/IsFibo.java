package mathematics.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsFibo {

    private static final List<Long> fibonacciList;

    static {
        fibonacciList = new ArrayList<>();
        fibonacciList.add(0, 0L);
        fibonacciList.add(1, 1L);
    }

    public static void addToPrecomputedList(Long n) {
        if (!fibonacciList.contains(n)) {
            fibonacciList.add(n);
        }
    }
    public static String isFibo(long n) {
        boolean isFibo = false;
        if (fibonacciList.contains(n)) {
            isFibo = true;
        } else if (n > fibonacciList.get(fibonacciList.size() - 1)){
            for (long i = fibonacciList.get(fibonacciList.size() - 2), j = fibonacciList.get(fibonacciList.size() - 1); j <= n; ) {
                addToPrecomputedList(i);
                if (n == i + j) {
                    isFibo = true;
                    addToPrecomputedList(j);
                    addToPrecomputedList(n);
                    break;
                }
                long temp = j;
                j = i + j;
                i = temp;
            }
        }
        return isFibo ? "IsFibo" : "IsNotFibo";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int i = 0;
        while(i < testCases) {
            long candidate = scanner.nextLong();
            System.out.println(isFibo(candidate));
            i++;
        }

    }
}
