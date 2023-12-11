package addHomework6;

import java.util.Arrays;
import java.util.Random;

public class Task_12_13_14 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 3;
        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(15);
        }
        int sum = 0;
        int average = 0;

        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
           sum = sum + intArray[i];
           average = sum / 3;
        }
        System.out.println("Summa = " + sum);
        System.out.println("Average of numbers = " + average);


}}
