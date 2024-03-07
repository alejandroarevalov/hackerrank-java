package miscelaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> arr) {
        int lonelyValue = -1;
        Map<Integer, Long> frequencies = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Integer number : frequencies.keySet()) {
            if (frequencies.get(number) == 1) {
                lonelyValue = number;
            }
        }
        return lonelyValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementCount = scanner.nextInt();
        List<Integer> elements = new ArrayList<>(elementCount);
        IntStream.range(0, elementCount).forEach(i -> elements.add(scanner.nextInt()));
        System.out.println(lonelyInteger(elements));
    }
}
