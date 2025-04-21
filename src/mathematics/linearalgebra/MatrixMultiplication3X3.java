package mathematics.linearalgebra;

public class MatrixMultiplication3X3 {

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
        int[][] matrix1 = {{1, 2, 3}, {2, 3, 4}, {1, 1, 1}};
        int[][] matrix2 = {{4, 5, 6}, {7, 8, 9}, {4, 5, 7}};
        int[][] result = multiplyMatrixes(matrix1, matrix2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
