package various;

import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int min = Collections.max(a);
        int max = Collections.min(b);
        int total = 0;
        boolean factor = true;
        for (int i = min; i <= max; i++) {
            factor = true;
            for(int current : a) {
                if (i % current != 0) {
                    factor = false;
                }
                if (!factor) {
                    break;
                }
            }
            for(int current : b) {
                if (current % i != 0) {
                    factor = false;
                }
                if (!factor) {
                    break;
                }
            }
            if (factor) {
                total++;
            }
        }
        return total;
    }
}
