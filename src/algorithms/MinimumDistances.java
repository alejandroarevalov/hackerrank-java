package algorithms;

import java.util.List;

public class MinimumDistances {

    public static int minimumDistances(List<Integer> a) {
        int minDistance = -1;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    int distance = Math.abs(i - j);
                    if (distance < minDistance || minDistance == -1) {
                        minDistance = distance;
                    }
                }
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        System.out.println(minimumDistances(List.of(3, 2, 1, 2, 3)));
        System.out.println(minimumDistances(List.of(7, 1, 3, 4, 1, 7)));
    }
}
