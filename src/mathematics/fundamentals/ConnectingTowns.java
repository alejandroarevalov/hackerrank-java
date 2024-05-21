package mathematics.fundamentals;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ConnectingTowns {

    public static int connectingTowns(int n, List<Integer> routes) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < routes.size(); i++) {
            result = result.multiply(new BigInteger(routes.get(i).toString()));
        }
        return result.mod(new BigInteger("1234567")).intValue();
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int testCases = console.nextInt();
        IntStream.range(0, testCases).forEach(index -> {
            int n = console.nextInt();
            List<Integer> citiesList = new ArrayList<>(n);
            IntStream.range(0, n - 1).forEach(routes -> {
                citiesList.add(routes, console.nextInt());
            });
            System.out.println(connectingTowns(n, citiesList));
        });
    }
}
