package miscelaneous;

import java.util.ArrayList;
import java.util.List;

public class TripletsWithSumZero {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};
        List<Integer[]> tripletas = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i == j || i == k || j == k) {
                        break;
                    } else {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            Integer[] arr = {nums[i], nums[j], nums[k]};
                            tripletas.add(arr);
                        }
                    }
                }
            }
        }
        tripletas.forEach(arr -> System.out.printf("[%d, %d, %d],\n", arr[0], arr[1], arr[2]));
    }
}
