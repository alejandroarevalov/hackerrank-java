package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {
        p.add(0, -1);
        List<Integer> finalList = new ArrayList<>();
        int max = p.stream().max(Integer::compareTo).get();
        for (int i = 1; i <= max ; i++) {
            int index = p.indexOf(i);
            finalList.add(p.indexOf(index));
        }
        return finalList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        IntStream.range(0, size).forEach(index -> array.add(index, scanner.nextInt()));
        permutationEquation(array).forEach(System.out::println);
        scanner.close();
    }
}
