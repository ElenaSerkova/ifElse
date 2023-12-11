package lesson15;
//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//   Выведите массивы на экран в двух отдельных строках
//   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//   для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 8;

        int[] intArray1 = new int[arraySize];
        for (int i = 0; i < intArray1.length; i++) {
            intArray1[i] = random.nextInt(1, 10);
        }

        int[] intArray2 = new int[arraySize];
        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));

            int sum2 = 0;
            int res2 = 0;

            for (int i = 0; i < intArray1.length; i++) {
                sum2 = intArray1[i] + sum2;
                res2 = sum2 / 10;

                System.out.println(sum2);

                int sum1 = 0;
                int res1 = 0;

                for ( i = 0; i < intArray1.length; i++) {
                    sum1 = intArray1[i] + sum1;
                    res1 = sum1 / 10;

                    System.out.println(sum1);
        }
            if (res1 > res2){
                System.out.println("The arithmetic mean of first array " + res1 + " is greater than second " + res2);
            } else if (res2 > res1) {
                System.out.println("The arithmetic mean of second array " + res2 + " is greater than first " + res1);
            } else if (res2 == res1){
                System.out.println("Arrays are equal" + res1 + " = " + res2);
            }


        }}}

