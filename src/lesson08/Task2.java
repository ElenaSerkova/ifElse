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

       int[] arrayInt = new int[3];

        arrayInt[0] = 3;
        arrayInt[1] = 5;
        arrayInt[2] = 3;

        System.out.println(Arrays.toString(arrayInt));

        //для сравнения чисел "==", для слов "equals"

        System.out.println(arrayInt[0] == arrayInt[1]);
        System.out.println(arrayInt[0] == arrayInt[2]);
        System.out.println(arrayInt[1] == arrayInt[2]);



            }}






