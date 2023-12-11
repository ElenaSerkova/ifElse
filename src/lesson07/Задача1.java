package lesson07;

//Задача 1.
//Получить степень числа.
// ***? Получить среднее арифметическое последовательности чисел.

import java.util.Scanner;

public class Задача1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 1; //!!!обязательно

        System.out.println("Enter number: ");
        int x = scanner.nextInt();
        System.out.println("Enter power: ");
        int y = scanner.nextInt();

        for (int i = 0; i < y; i++){
            result = result * x;

        }
        System.out.println("Number " + x + " to the power of " + y + " is " + result);



    }
}
