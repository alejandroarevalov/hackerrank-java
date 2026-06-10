package algorithms;

public class LibraryFine {
    /*
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */

    public int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int finePerDay = 15;
        int finePerMonth = 500;
        int finePerYear = 10000;

        if (y1 - y2 > 0) {
            return (y1 - y2) * finePerYear;
        } else if (m1 - m2 > 0 && y1 - y2 == 0) {
            return (m1 - m2) * finePerMonth;
        } else if (d1 - d2 > 0 && m1 - m2 == 0 && y1 - y2 == 0) {
            return (d1 - d2) * finePerDay;
        }
        return 0;
    }

    public static void main(String[] args) {
        var libraryFine = new LibraryFine();
        System.out.println(libraryFine.libraryFine(9, 6, 2015, 6, 6, 2015));
        System.out.println(libraryFine.libraryFine(2, 7, 1014, 1, 1, 1015));
        System.out.println(libraryFine.libraryFine(15, 7, 2014, 1, 7, 2015));
    }
}


