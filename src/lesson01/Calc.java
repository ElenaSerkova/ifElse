package lesson01;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 1 число: ");
        float x = scan.nextFloat();

        System.out.println("Введите 2 число: ");
        float y = scan.nextFloat();

        float res1 = x + y;
        float res2 = x - y;
        float res3 = x * y;
        float res4 = x / y;

        System.out.println("Результат: ");
        System.out.println(res1 +  "\n" + res2 + "\n" + res3 + "\n" + res4);

    }
}