package addHomework1;

import java.util.Scanner;

//Написать консольную программу, которая запрашивает у пользователя два вещественных
// числа(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
// Вещественные числа можно запрашивать с консоли используя обьект Scanner следующим образом:
// Scanner scanner = new Scanner(System.in);
// double firstDoubleNumber = scanner.nextDouble();
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();

        double res1 = num1 + num2;
        double res2 = num1 - num2;
        double res3 = num1 * num2;
        double res4 = num1 / num2;

        System.out.println("Addition result ist " + res1);
        System.out.println("Subtraction result ist " + res2);
        System.out.println("Multiplication result ist " + res3);
        System.out.println("Division result ist " + res4);

    }


}
