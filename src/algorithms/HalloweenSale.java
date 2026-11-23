package algorithms;

public class HalloweenSale {

    public static int howManyGames(int p, int d, int m, int s) {
        int available = s;
        int currentPrice = p;
        int videoGamesBought = 0;
        while (available >= currentPrice) {
            videoGamesBought++;
            available -= currentPrice;
            if (currentPrice - d > m) {
                currentPrice -= d;
            } else {
                currentPrice = m;
            }

        }
        return videoGamesBought;

    }

    public static void main(String[] args) {
        System.out.println(howManyGames(16, 2, 1, 9981));
    }
}
