package datastructures;

import java.util.ArrayList;
import java.util.List;

public class ArraysDS {

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> list = new ArrayList<>();
        for(int i = a.size() - 1, j = 0; i >= 0; i--, j++) {
            list.add(j, a.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(reverseArray(List.of(1, 2, 3, 4, 5)));
    }
}
