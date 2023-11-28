package lesson07;

import java.util.Scanner;

//Task 4 Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа
//567432 -> 5+6+7+4+3+2 -> 27
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int currentDigital = 0;
        boolean num = true;

        while (num){
        System.out.println("Please enter any min five-digit integer number: ");

        int x = scan.nextInt();

        if (x >= 10000 && x <= 99999) {

        currentDigital = x % 10;
        sum = sum + currentDigital;
        x = x / 10;

        currentDigital = x % 10;
        sum = sum + currentDigital;
        x = x / 10;

        currentDigital = x % 10;
        sum = sum + currentDigital;
        x = x / 10;

        currentDigital = x % 10;
        sum = sum + currentDigital;
        x = x / 10;

        currentDigital = x % 10;
        sum = sum + currentDigital;
        x = x / 10;

        sum = sum + x;

        System.out.println("Sum of numbers is " + sum);

        } else {
             System.out.println("False");}
}}}



