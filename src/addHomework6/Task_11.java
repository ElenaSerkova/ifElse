package addHomework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your array size: ");
        int arraySize = scan.nextInt();
        Random random = new Random();

        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt();
            System.out.println("Please enter " + i + " element of array");
            intArray[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(intArray));
    }
}
