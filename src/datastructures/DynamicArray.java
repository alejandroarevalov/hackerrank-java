package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int[][] array = new int[n][10];
        int lastAnswer = 0;
        int[] indexesControl = new int[n];
        int[] answers = new int[n];
        int answerIndex = 0;

        // Filling arrays with zeros
        for (int i = 0; i < n; i++) {
            Arrays.fill(array[i], -1);
        }
        Arrays.fill(indexesControl, 0);
        Arrays.fill(answers, -1);

        for (List<Integer> integers : queries) {
            int query = integers.get(0);
            int x = integers.get(1);
            int y = integers.get(2);
            int index = (x ^ lastAnswer) % n;
            if (query == 1) {
                //array[index][indexesControl[index]] = y;
                array = setAndRearrangeArray(array, index, indexesControl[index], y);
                indexesControl[index]++;
            } else if (query == 2) {
                lastAnswer = array[index][y % nonZeroSize(array[index])];
                answers[answerIndex] = lastAnswer;
                answerIndex++;
            }
        }
        return Arrays.stream(answers).boxed().filter(ans -> ans != -1).collect(Collectors.toList());
    }


    public static int[][] setAndRearrangeArray(int[][] array, int rowIndex, int colIndex, int value) {
        int occupiedSize = nonZeroSize(array[rowIndex]);
        if (occupiedSize >= array[rowIndex].length * 0.9) {
            int[] newArray = new int[(int)(array[rowIndex].length * 1.5)];
            Arrays.fill(newArray, -1);
            System.arraycopy(array[rowIndex], 0, newArray, 0, array[rowIndex].length);
            newArray[colIndex] = value;
            array[rowIndex] = newArray;
        } else {
            array[rowIndex][colIndex] = value;
        }
        return array;
    }

    private static int nonZeroSize(int[] subArray) {
        int nonZeroSize = 0;
        for (int j : subArray) {
            if (j != -1) {
                nonZeroSize++;
            } else {
                break;
            }
        }
        return nonZeroSize;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Code block built for testing a large test case
        /*
        Scanner scanner = new Scanner(new File("src/datastructures/inputda.txt"));
        int n = scanner.nextInt();
        int queries = scanner.nextInt();
        List<List<Integer>> queriesList = new ArrayList<>(n);

        for (int i = 0; i < queries; i++) {
            int number = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            queriesList.add(new ArrayList<>(Arrays.asList(number, x, y)));
        }
        System.out.println(dynamicArray(n, queriesList));
        */
        System.out.println(
            dynamicArray(2, List.of(
                List.of(1, 0, 5),
                List.of(1, 1, 7),
                List.of(1, 0, 3),
                List.of(2, 1, 0),
                List.of(2, 1, 1)
            ))
        );
    }
}
