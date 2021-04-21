import java.util.Arrays;
import java.util.List;

public class BillDivision {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i == k) {
                continue;
            } else {
                total += bill.get(i);
            }
        }
        total /= 2;

        if (total == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - total);
        }
    }

    public static void main(String[] args) {
        List<Integer> bill = Arrays.asList(3, 10, 2, 9);
        bonAppetit(bill, 1, 7);
    }
}
