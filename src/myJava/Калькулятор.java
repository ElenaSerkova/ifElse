package myJava;

import java.util.Scanner;

public class Калькулятор {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        double x = scanner.nextDouble();

        System.out.print("Введите 2 число: ");
        double y = scanner.nextDouble();

        double res1 = x + y;
        double res2 = x - y;
        double res3 = x * y;
        double res4 = x / y;

        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);

    }
}
