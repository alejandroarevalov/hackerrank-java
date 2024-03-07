package miscelaneous;

import java.util.Scanner;

public class DrawingBook {

    static int pageCount(int n, int p) {
        int pages = 0;

        if (n/2 >= p){
            pages = p / 2;
        } else if (n/2 < p) {
            if (n % 2 == 0) {
                n++;
            }
            pages = (n - p) / 2;

        }
        return pages;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookPages = scanner.nextInt();
        int pageToGo = scanner.nextInt();
        System.out.println(pageCount(bookPages, pageToGo));

    }
}
