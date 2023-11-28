package lesson08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. Создать массив размера , полученного от пользователя
//Наполнить этот массив случайными числами в диапазоне до 100
//- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
//- найти сумму всех элементов
//
//**
//если максимальный элемент повторяется несколько раз то создать массив из индесов
//
//в идеале - оформить основные модули вашей программы отдельными методами
public class Task0 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter your array size: ");
        int arraySize = scanner.nextInt();

        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
            System.out.println("Please enter " + i + " element of array");
            intArray[i] = scanner.nextInt();
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

        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
                sum = intArray[i] + sum;
            }
            System.out.println("Sum all numbers is: " + sum);

        }
    }

