package lesson15;

import java.util.Arrays;
import java.util.Random;

//Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//Определите какой элемент является в этом массиве максимальным и
//сообщите индекс его последнего вхождения в массив.
public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 12;
        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(-15, 15);
        }
        System.out.println(Arrays.toString(intArray));

        int max = intArray[0];
        int indexMax = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
                indexMax = i;
            }
        }

        System.out.println("Max from array = " + max + " and index = " + indexMax);

    }
}
