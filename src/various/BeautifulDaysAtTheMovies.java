package various;

public class BeautifulDaysAtTheMovies {
    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int a = i; a <= j; a++) {
            Integer value = a;
            String reversed = new StringBuilder(value.toString()).reverse().toString();
            Integer value2 = Integer.parseInt(reversed);
            if (Math.abs(value - value2) % k == 0) {
                count++;
            }
        }
        return count;
    }
}
