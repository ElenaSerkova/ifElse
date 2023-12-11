package lesson08;
/* 5. **Вычисление среднего значения элементов массива:** Напишите метод на Java,
который принимает массив целых чисел и возвращает их среднее значение.
Если массив пуст, метод должен возвращать 0. Например, для массива `[1, 2, 3, 4, 5]` среднее значение будет 3.
 */

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        int [] arrayInt = new int[5];

        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;

        int sum = arrayInt[0] + arrayInt[1] + arrayInt[2] + arrayInt[3] + arrayInt[4];

        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Среднее значение = " + sum/5);

    }}
