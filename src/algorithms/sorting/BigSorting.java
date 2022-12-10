package algorithms.sorting;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class BigSorting {

    /*
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */
    public static List<String> bigSorting(List<String> unsorted) {
        Comparator<String> stringComparator = (String str1, String str2) -> str1.length() > str2.length() ? 1 : str1.length() < str2.length() ? -1 : str1.compareTo(str2);
        unsorted.sort(stringComparator);
        return unsorted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> numbers = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.next());
        }
        bigSorting(numbers).stream().forEach(System.out::println);
    }
}
