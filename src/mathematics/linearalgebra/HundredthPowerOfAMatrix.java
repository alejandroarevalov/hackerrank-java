package mathematics.linearalgebra;

import java.util.Arrays;

public class HundredthPowerOfAMatrix {

    public static int[][] powerOfAMatrix(int[][] matrix, int n) {
        int[][] copy = Arrays.copyOf(matrix, matrix.length);
        int[][] result = null;
        for (int i = 0; i < n - 1; i++) {
            result = multiplyMatrixes(matrix, copy);
            matrix = result;
        }
        return result;
    }

    public static int[][] multiplyMatrixes(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrix2[0].length; k++) {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] powered = powerOfAMatrix(matrix, 100);
        System.out.println(powered[0][0]);
        System.out.println(powered[0][1]);
        System.out.println(powered[1][1]);
        System.out.println(powered[2][1]);
        System.out.println(powered[2][2]);
    }
}
