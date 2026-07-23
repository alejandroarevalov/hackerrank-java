package algorithms;

public class TaumBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        int whiteGiftsPrize = Math.min(bc + z, wc);
        int blackGiftsPrize = Math.min(wc + z, bc);
        return (long) whiteGiftsPrize * w + (long) blackGiftsPrize * b;
    }

    public static void main(String[] args) {
        System.out.println(taumBday(27984, 1402, 619246, 615589, 247954));
        System.out.println(taumBday(95677, 39394, 86983, 311224, 588538));
    }
}
