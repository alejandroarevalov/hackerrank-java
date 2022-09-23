package various;

public class NumberLineJumps {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        if (v2 - v1 != 0) {
            int res = (x2 - x1)/(v1 - v2);
            if (res > 0 && ((x2 - x1) % (v1 - v2) == 0)) {
                result = "YES";
            }
        }
        return result;
    }
}
