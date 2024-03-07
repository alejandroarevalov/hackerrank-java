package miscelaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindTheMedian {

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int medianPosition = arr.size() / 2;
        return arr.get(medianPosition);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = scanner.nextInt();
        List<Integer> elements = new ArrayList<>(elementsCount);
        IntStream.range(0, elementsCount).forEach(i -> elements.add(scanner.nextInt()));
        System.out.println(findMedian(elements));
    }
}
