package various;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int types[] = new int[5];
        Arrays.fill(types, 0);
        for (Integer type : arr) {
            types[type-1]++;
        }
        int maxIndex = 0;
        int maxCount = 0;
        for (int i = 0; i < types.length; i++) {
            if (types[i] > maxCount) {
                maxCount = types[i];
                maxIndex = i + 1;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) throws IOException {

        Integer arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        int result = migratoryBirds(Arrays.asList(arr));
        System.out.println(result);
    }
}
