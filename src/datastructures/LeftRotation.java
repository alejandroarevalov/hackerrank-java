package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Rotating to left n positions is equivalent to rotate "list.size() - d" positions to the right.
        int[] newList = new int[arr.size()];
        Arrays.fill(newList, -1);
        int addingFactor = arr.size() - d;
        for (int i = 0; i < arr.size(); i++) {
            newList[(i + addingFactor) % arr.size()] = arr.get(i);
        }
        return Arrays.stream(newList).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(
            rotateLeft(4, List.of(1, 2, 3, 4, 5))
        );
    }
}
