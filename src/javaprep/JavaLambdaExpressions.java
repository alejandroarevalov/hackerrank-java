package javaprep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    PerformOperation isOdd() {
        PerformOperation po = (number) -> number % 2 != 0;
        return po;
    }

    PerformOperation isPrime() {
        PerformOperation po = number -> {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        };
        return po;
    }

    PerformOperation isPalindrome() {
        PerformOperation po = number -> new StringBuilder(String.valueOf(number))
                .reverse()
                .toString()
                .equals(String.valueOf(number));
        return po;
    }
}

public class JavaLambdaExpressions {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T --> 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
                }
                System.out.println(ans);
            }
        }
}
