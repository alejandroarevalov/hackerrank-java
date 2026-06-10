package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {

    public static int equalizeArray(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer integer : arr) {
            if (!map.containsKey(integer)) {
                map.put(integer, 1);
            } else {
                map.put(integer, map.get(integer) + 1);
            }
        }
        int maxRepetitions = Collections.max(
            map.entrySet(),
            Map.Entry.comparingByValue()
        ).getValue();
        return arr.size() - maxRepetitions;
    }

    public static void main(String[] args) {
        System.out.println(equalizeArray(Arrays.asList(3, 3, 2, 1, 3)));
        System.out.println(equalizeArray(Arrays.asList(1, 2, 2, 3)));
    }
}
