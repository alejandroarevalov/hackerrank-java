package mathematics.linearalgebra;

public class MatrixSubtraction {

    public static int[][] subtractMatrixes(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {2, 3, 4}, {1, 1, 1}};
        int[][] matrix2 = {{4, 5, 6}, {7, 8, 9}, {4, 5, 0}};
        int[][] result = subtractMatrixes(matrix1, matrix2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
