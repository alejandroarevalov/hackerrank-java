package algorithms;

public class ModifiedKaprekarNumbers {

    public static void kaprekarNumbers(int p, int q) {
        StringBuilder answer = new StringBuilder();
        for (int i = p; i <= q; i++) {
            int digits = String.valueOf(i).length();
            long squared = ((long) i * i);
            long rightPart = squared % (long) Math.pow(10, digits);
            long leftPart = (squared - rightPart) / (long) Math.pow(10, digits);
            if (leftPart + rightPart == i) {
                answer.append(i).append(" ");
            }
        }
        if (answer.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            answer.deleteCharAt(answer.length() - 1);
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        kaprekarNumbers(400, 700);
    }
}
