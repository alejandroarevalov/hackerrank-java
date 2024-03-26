package algorithms;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JumpingOnTheCloudsRevisited {

    public static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int n = c.length;
        int index = 0;
        do {
            index = (index + k) % n;
            if (c[index] == 0) {
                energy--;
            } else {
                energy -= 3;
            }
        } while(index % n != 0);
        return energy;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] clouds = new int[n];
        IntStream.range(0, n).forEach(index -> clouds[index] = scanner.nextInt());
        System.out.println(jumpingOnClouds(clouds, k));
    }
}
