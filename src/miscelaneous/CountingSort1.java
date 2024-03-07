package miscelaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] frequencies = new int[100];
        Arrays.fill(frequencies, 0);
        arr.forEach(element -> frequencies[element]++);
        return Arrays.stream(frequencies).boxed().toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = scanner.nextInt();
        List<Integer> elementsList = new ArrayList<>(elementsCount);
        IntStream.range(0, elementsCount).forEach(i -> elementsList.add(i, scanner.nextInt()));
        countingSort(elementsList).forEach(element -> System.out.print(element + " "));
    }
}
