package various;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

  public static int diagonalDifference(List<List<Integer>> multiList) {
    int leftDiag = 0, rightDiag = 0;
    for(int i = 0; i < multiList.size(); i++) {
      leftDiag += multiList.get(i).get(i);
      rightDiag += multiList.get(multiList.size() - (i+1)).get(i);
    }
    return Math.abs(leftDiag - rightDiag);
  }

  private static List<List<Integer>> convertMatrixToMultiList(int[][] array) {
    List<List<Integer>> rows = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      List<Integer> col = new ArrayList<>();
      for(int j = 0; j < array[i].length; j++) {
        col.add(array[i][j]);
      }
      rows.add(col);
    }
    return rows;
  }

  public static void main(String[] args) {
    int [][] arr1 = {{1, 2, 3}, {4, 5, 6}, {9, 8 ,9}};
    int [][] arr2 = {{11, 2, 4}, {4, 5, 6}, {10, 8 ,-12}};
    List<List<Integer>> input = convertMatrixToMultiList(arr1);
    System.out.println(diagonalDifference(input));
    input.forEach(list -> {
      list.forEach(element -> System.out.print(element + " "));
      System.out.println();
    });
    input = convertMatrixToMultiList(arr2);
    System.out.println(diagonalDifference(input));
    input.forEach(list -> {
      list.forEach(element -> System.out.print(element + " "));
      System.out.println();
    });
  }
}
