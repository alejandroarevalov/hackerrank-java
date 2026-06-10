package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> mutableList = new ArrayList<>(arr);
        List<Integer> result = new ArrayList<>();

        while (!mutableList.isEmpty()) {
            // Updating list by chunks
            int min = Collections.min(mutableList);
            result.add(mutableList.size());
            for (int i = 0; i < mutableList.size(); i++) {
                mutableList.set(i, mutableList.get(i) - min);
            }
            mutableList = mutableList.stream().filter(number -> number > 0).collect(Collectors.toCollection(ArrayList::new));
        }
        return result;
    }

    public static void main(String[] args) {
        cutTheSticks(List.of(1, 2, 3, 4, 3, 3, 2, 1));
        cutTheSticks(List.of(5, 4, 4, 2, 2, 8));
    }
}
