package miscelaneous;

public class FindThePoint {

    /*
     * Complete the findPoint function below.
     */
    static int[] findPoint(int px, int py, int qx, int qy) {
        int rx = qx - px + qx;
        int ry = qy - py + qy;
        int arr[] = new int[2];
        arr[0] = rx;
        arr[1] = ry;
        return arr;
    }
}
