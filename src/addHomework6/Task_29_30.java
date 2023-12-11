package addHomework6;

import java.util.Arrays;
import java.util.Random;

public class Task_29_30 {

    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 10;
        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }
        int even = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
         intArray[i] = even; }

            int odd = intArray[0];
            for ( i = 0; i < intArray.length; i++) {
                if (intArray[i] % 2 != 0) {
                    intArray[i] = odd; }


            System.out.println(Arrays.toString(intArray));
            System.out.println("Even: " + even);
            System.out.println("Odd: " + odd);

    }}}}