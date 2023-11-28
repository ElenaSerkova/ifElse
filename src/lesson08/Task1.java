package lesson08;
/*1. **Перевернуть массив:** Создайте метод, который принимает массив целых чисел и возвращает
его в перевернутом порядке. Например, если входной массив `[1, 2, 3, 4]`, то результат должен быть `[4, 3, 2, 1]`.
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] arrayInt = new int[4];

        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;

        System.out.println(Arrays.toString(arrayInt));

        System.out.println("=============================");

        System.out.println(arrayInt[0] == arrayInt[3]);
        System.out.println(arrayInt[1] == arrayInt[2]);
        System.out.println(arrayInt[2] == arrayInt[1]);
        System.out.println(arrayInt[3] == arrayInt[0]);

        System.out.println(Arrays.toString(arrayInt));
    }


}
