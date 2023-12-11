package addHomework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arrays size: ");
        int arraySize = scan.nextInt();
        Random random = new Random();

        int [] intArray = new int[arraySize];

            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = random.nextInt(100);
            }
        System.out.println(Arrays.toString(intArray));
    }
}
