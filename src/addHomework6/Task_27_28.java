package addHomework6;

import java.util.Arrays;
import java.util.Random;

public class Task_27_28 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 10;
        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(intArray));

        int min = intArray[0];
        int indexMin = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
                indexMin = i;
            }
        }

        System.out.println("Min from array = " + min + " and index = " + indexMin);

        int max = intArray[0];
        int indexMax = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
                indexMax = i;
            }
        }

        System.out.println("Max from array = " + max + " and index = " + indexMax);

    }}
