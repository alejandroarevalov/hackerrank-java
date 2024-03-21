package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CircularArrayRotation {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        IntStream.range(0, k).forEach(rotationCount -> {
            Integer temp = a.get(a.size() - 1);
            a.remove(a.size() - 1);
            a.add(0, temp);
        });
        List<Integer> queryResult = new ArrayList<>();
        queries.forEach(query -> queryResult.add(a.get(query)));
        return queryResult;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int rotationCount = scanner.nextInt();
        int queries = scanner.nextInt();
        List<Integer> queriesList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        IntStream.range(0, arraySize).forEach(index -> list.add(index, scanner.nextInt()));
        IntStream.range(0, queries).forEach(index -> queriesList.add(index, scanner.nextInt()));
        List<Integer> result = circularArrayRotation(list, rotationCount, queriesList);
        result.forEach(System.out::println);
    }
}
