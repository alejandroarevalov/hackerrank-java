package various;

import java.util.Arrays;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 1L * arr[0] + arr[1] + arr[2] + arr[3];
        long max = 1L * arr[1] + arr[2] + arr[3] + arr[4];
        System.out.print(min);
        System.out.print(" ");
        System.out.println(max);
    }
}
