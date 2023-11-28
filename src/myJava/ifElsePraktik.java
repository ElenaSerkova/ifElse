package myJava;

import java.util.Scanner;

public class ifElsePraktik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время в секундах: ");
        int x = scan.nextInt();
        int result = x, result1 = x / 3600, result2 = x / 60;

        if (x > 3600 && x <= 28800){
        System.out.println("До конца рабочего дня: " + result1 + " час." + "\n" + "или " + result2 + " мин." + "\n" + "или " + result + " сек.");
        } else if (x <= 3600 && x >= 0) {
            System.out.println("До конца рабочего дня менее часа, а именно " + result2 + " мин." + "\n" + "или " + result + " сек.");
        } else if (x > 28801) {
            System.out.println("Данные введены не корректно! В рабочем дне 28800 секунд.");
        } else {
            System.out.println("Данные введены не корректно!");
        }


    }
}
