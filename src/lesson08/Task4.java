package lesson08;
/* 4. **Определение диапазона чисел в массиве:** Разработайте программу на Java,
которая анализирует массив целых чисел и определяет разницу между наибольшим и наименьшим значениями.
Например, для массива `[3, 7, 2, 9, 4]` программа должна сообщить,
что разница между максимальным (9) и минимальным (2) значениями равна 7.
 */

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        int [] intArray = new int[5];

        intArray[0] = 35;
        intArray[1] = 77;
        intArray[2] = 1;
        intArray[3] = 14;
        intArray[4] = 81;

        System.out.println(Arrays.toString(intArray));

        int min = intArray[0];


        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];

            }
        }

        System.out.println("Min from array = " + min);

        int max = intArray[0];


        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];

            }
    }    int res = max - min;

        System.out.println("Max from array = " + max);
        System.out.println("Difference between max and min is: " + res);
}}
