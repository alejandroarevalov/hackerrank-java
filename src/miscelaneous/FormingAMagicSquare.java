package miscelaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FormingAMagicSquare {


    public static int[][] transformToMatrix(List<List<Integer>> multiArray) {
        int[][] matrix = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = multiArray.get(i).get(j);
            }
        }
        return matrix;
    }

    public static List<Integer[][]> buildSolutionsSpace() {
        List<Integer[][]> solutionsSpace = new ArrayList<>(8);
        Integer[][] solution1 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        Integer[][] solution2 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        Integer[][] solution3 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        Integer[][] solution4 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        Integer[][] solution5 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
        Integer[][] solution6 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
        Integer[][] solution7 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
        Integer[][] solution8 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        solutionsSpace.add(0, solution1);
        solutionsSpace.add(1, solution2);
        solutionsSpace.add(2, solution3);
        solutionsSpace.add(3, solution4);
        solutionsSpace.add(4, solution5);
        solutionsSpace.add(5, solution6);
        solutionsSpace.add(6, solution7);
        solutionsSpace.add(7, solution8);

        return solutionsSpace;
    }
    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][] matrix = transformToMatrix(s);
        int result = Integer.MAX_VALUE;
        List<Integer[][]> solutions = buildSolutionsSpace();
        for (int i = 0; i < solutions.size(); i++) {
            Integer[][] currentMatrix = solutions.get(i);
            int abs = 0;
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    abs += Math.abs(matrix[j][k] - currentMatrix[j][k]);
                }
            }
            if (abs < result) {
                result = abs;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int size = 3;
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> input = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            List<Integer> row = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                row.add(j, scanner.nextInt());
            }
            input.add(i, row);
        }
        System.out.println(formingMagicSquare(input));
    }
}
