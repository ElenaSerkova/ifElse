package lesson07;

// 3. Используйте цикл, чтобы просуммировать все числа, которые ввел пользователь, до первого отрицательного.
import java.util.Scanner;

public class Unit03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean condition = true;

        System.out.println("Please enter integer number (negative number for exit");

        while (condition) {
            int number = scanner.nextInt();

            if (number >= 0) {
                sum = sum + number;
            } else {
                condition = false;
            }
        }
        System.out.println("Sum all numbers is: " + sum);
    }
}
