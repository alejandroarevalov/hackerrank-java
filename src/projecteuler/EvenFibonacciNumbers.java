package projecteuler;

public class EvenFibonacciNumbers {

    public static long evenFibonacciNumbers(long number) {
        long a = 0L;
        long b = 1L;
        long pairs = 0;
        while (b <= number) {
            long temp = b;
            b = a + b;
            a = temp;
            if (a % 2 == 0) {
                pairs += a;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(evenFibonacciNumbers(10));
    }
}
