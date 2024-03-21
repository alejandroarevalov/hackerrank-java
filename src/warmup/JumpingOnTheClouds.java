package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> cloudsList) {
        int jumps = 0;
        int currentIndex = 0;
        while(currentIndex < cloudsList.size() - 1) {
            if (currentIndex + 2 < cloudsList.size() && cloudsList.get(currentIndex + 2) == 0){
                currentIndex += 2;
            } else {
                currentIndex++;
            }
            jumps++;
        }
        return jumps;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clouds = scanner.nextInt();
        ArrayList<Integer> cloudsList = new ArrayList<>(clouds);
        IntStream.range(0, clouds).forEach(index -> cloudsList.add(index, scanner.nextInt()));
        System.out.println(jumpingOnClouds(cloudsList));
        scanner.close();
    }
}
