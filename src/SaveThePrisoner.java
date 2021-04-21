public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s ) {
        int rest = m % n;
        return s - 1 + rest;
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(999999999, 999999999, 1));
    }
}
