package lesson01;

import java.util.Scanner;

public class Mathe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float x = 50, y = 13; // можно все значения писать в одну строку, если переменная одинаковая (short, int...)
        float res = x + y;
        res /= 2;
        System.out.println("Результат: " + res + ".");
        res = x - y;
        res++; // res++ прибавляет 1, res-- вычитает 1
        System.out.println("Результат: " + res + ".");
        res = x * y;
        res += 10; //res -= 19; res *= 5; res /= 2; и т.д.
        System.out.println("Результат: " + res + ".");
        res = x / y;
        res -= 11;
        System.out.println("Результат: " + res + ".");
        res = x % y;
        System.out.println("Результат: " + res + ".");

    }
}