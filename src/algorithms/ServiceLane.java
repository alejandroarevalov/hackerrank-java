package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ServiceLane {

    public static List<Integer> serviceLane(List<Integer> widths, List<List<Integer>> cases) {
        List<Integer> results = new ArrayList<>(cases.size());
        cases.forEach(list -> results.add(
                widths.subList(list.get(0), list.get(1) + 1)
                        .stream()
                        .min(Integer::compareTo)
                        .orElseGet(() -> -1))
        );
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        List<Integer> widths = new ArrayList<>();
        IntStream.range(0, n).forEach(index -> widths.add(index, scanner.nextInt()));
        List<List<Integer>> cases = new ArrayList<>(t);
        IntStream.range(0, t).forEach(index -> {
            List<Integer> caseRow = new ArrayList<>(2);
            caseRow.add(scanner.nextInt());
            caseRow.add(scanner.nextInt());
            cases.add(caseRow);
        });
        serviceLane(widths, cases).forEach(System.out::println);

    }
}
