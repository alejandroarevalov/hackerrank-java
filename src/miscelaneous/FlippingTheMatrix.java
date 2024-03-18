package miscelaneous;

import java.util.List;

public class FlippingTheMatrix {

    public static Integer[][] transformToIntegerMatrix(List<List<Integer>> matrixList) {
        Integer[][] matrix = new Integer[matrixList.size()][matrixList.get(0).size()];
        for (int i = 0; i < matrixList.size(); i++) {
            for (int j = 0; j < matrixList.get(0).size(); j++) {
                matrix[i][j] = matrixList.get(i).get(j);
            }
        }
        return matrix;
    }

    public static Integer[][] switchRows(int row1, int row2, Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

        }
        return null;
    }
        

    public static int flippingMatrix(List<List<Integer>> matrixList) {
        Integer[][] matrix = transformToIntegerMatrix(matrixList);
        return 0;
    }
}
