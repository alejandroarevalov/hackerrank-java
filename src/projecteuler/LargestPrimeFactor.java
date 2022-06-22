package projecteuler;

import java.util.*;

public class LargestPrimeFactor {

    public static long largestPrimeFactor(long number) {
        Set<Long> factors = new TreeSet<>();
        long i = 2L;
        while(i <= Math.sqrt(number)) {
            if (number % i == 0) {
                factors.add(i);
                number = number / i;
                i = 2L;
                continue;
            }
            if (i == 2L) {
                i++;
            } else {
                i += 2L;
            }
        }
        if (number != 1L) {
            factors.add(number);
        }
        return factors.stream().max(Comparator.naturalOrder()).get();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short testCases = in.nextShort();
        for(short i = 0; i < testCases; i++){
            long number = in.nextLong();
            System.out.println(largestPrimeFactor(number));
        }
    }
}