package addHomework1;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
// три целых числа и выводит их среднее арифметическое
// (складывает все числа и делит на их количество).
// Примечение: обратите внимание, что результат может быть дробным числом.
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integer number");
        System.out.println("First number: ");
        int num1 = scan.nextInt();
        System.out.println("Second number: ");
        int num2 = scan.nextInt();
        System.out.println("Third number: ");
        int num3 = scan.nextInt();

        double sum = num1 + num2 + num3;
        double res = sum / 3;

        System.out.println("Arithmetic mean of numbers " + num1 + " , " + num2 + " , " + num3 + " is " + res);
    }
}
