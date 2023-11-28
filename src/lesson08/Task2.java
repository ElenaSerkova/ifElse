package lesson08;
/*
2. **Проверка на уникальность элементов:** Напишите функцию, которая проверяет, все ли элементы в массиве уникальны.
Функция должна возвращать `true`, если все элементы уникальны, и `false`, если найдены дубликаты.
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter your array size: ");
        int arraySize = scanner.nextInt();

        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10);
            System.out.println("Please enter " + i + " element of array");
            intArray[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {

                for (int j = i + 1; j < intArray.length; j++)
                {
                    if (intArray[i] == intArray[j]);


                }
                }
            }

            }






