package algorithms;

import java.util.List;

public class BeautifulTriplets {

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int listSize = arr.size();
        int beautifulTripletsFound = 0;
        for (int i = 0; i < listSize - 2; i++) {
            for (int j = i + 1; j < listSize - 1; j++) {
                for (int k = j + 1; k < listSize ; k++) {
                    int diff1 = arr.get(j) - arr.get(i);
                    int diff2 = arr.get(k) - arr.get(j);
                    if (diff2 > d) {
                        break;
                    }
                    if (diff1 == diff2 && diff1 == d) {
                        beautifulTripletsFound++;
                    }
                }
            }
        }
        return beautifulTripletsFound;
    }

    public static void main(String[] args) {
        System.out.println(beautifulTriplets(1, List.of(2, 2, 3, 4, 5)));
        System.out.println(beautifulTriplets(3, List.of(1, 2, 4, 5, 7, 8, 10)));
    }
}
