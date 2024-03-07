package miscelaneous;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int max = 1;
        for (int i = 0; i < a.size(); i++) {
            int temp = 1;
            for (int j = i + 1; j < a.size(); j++) {
                if (Math.abs(a.get(i) - a.get(j)) <= 1) {
                    temp++;
                }
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> testList = Arrays.asList(4, 6, 5, 3, 3, 1);
        List<Integer> testList2 = Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5);
        System.out.println(pickingNumbers(testList));
        System.out.println(pickingNumbers(testList2));
    }
}
