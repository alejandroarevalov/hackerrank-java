package various;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        //fizzBuzz(15);
        lambdaFizzBuzz(15);
        // fizzBuzz(14);
        // fizzBuzz(22);
    }

    public static void fizzBuzz(int n) {
        int i = 1;
        while(i <= n) {
            String answer = "";
            if (i % 3 == 0) {
                answer = "Fizz";
            }
            if (i % 5 == 0) {
                answer += "Buzz";
            }
            System.out.println(answer.length() > 0 ? answer : i);
            i++;
        }
    }

    public static void lambdaFizzBuzz(int n) {
        IntStream.rangeClosed(1, n).forEach(number -> {
            String answer = "";
            answer = number % 3 == 0 ? "Fizz" : "";
            answer += number % 5 == 0 ? "Buzz" : "";
            System.out.println(answer.length() > 0 ? answer : number);
        });
    }
}
