package lesson07;

import java.util.Scanner;

public class Unit01 {
    //1. Подсчитать сумму всех четных чисел от 0 до N
    //при том что N вводится пользователем
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean condition = true;

        System.out.println("Please enter integer even number (odd number for exit)");

while (condition){
    int number = scanner.nextInt();

        if (number % 2 == 0){
            sum = sum + number;
            } else {
        condition = false;
    }
}
        System.out.println("Sum all even numbers is: " + sum);
}}

