package lesson07;

import java.util.Scanner;

//5. Пользователь ввел число N. Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N
public class Unit05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int currentDigital = 0;
        boolean num = true;

        while (num){
            System.out.println("Please enter any min five-digit integer number: ");

            int x = scan.nextInt();

            if (x >= 10000 && x <= 99999) {
                System.out.println("Sum of numbers is " + sum);

            } else {
                System.out.println("False");}


        }}
}
