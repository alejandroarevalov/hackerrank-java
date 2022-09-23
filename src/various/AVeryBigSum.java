package various;

public class AVeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0L;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
}
