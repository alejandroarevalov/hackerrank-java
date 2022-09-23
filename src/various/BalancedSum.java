package various;

import java.util.Arrays;
import java.util.List;

public class BalancedSum {

    public static int balancedSum(List<Integer> arr) {
        int pivot = arr.size()/2;
        boolean pivotFound = false;
        do {
            int leftSum = 0;
            int rightSum = 0;
            for(int i = pivot-1; i >= 0; i--) {
                leftSum += arr.get(i).intValue();
            }
            for(int j = pivot+1; j < arr.size(); j++) {
                rightSum += arr.get(j).intValue();
            }

            if (leftSum == rightSum) {
                pivotFound = true;
            } else if (leftSum < rightSum) {
                pivot++;
            } else if (leftSum > rightSum) {
                pivot--;
            }
        } while(!pivotFound);
        return pivot;
    }

    public static void main(String[] args) {
        System.out.println(balancedSum(Arrays.asList(1, 2, 3, 3)));
    }
}
