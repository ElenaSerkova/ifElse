package lesson07;

import java.util.Scanner;

public class Задача4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0  ) {
            System.out.println("Year is Leap");
        } else {
            System.out.println("Year is not Leap");
        }

        System.out.println("============================================");
        int i = 0;

        for (i = 2024; i >= 1983; i -= 1) {
            if ((i % 4 == 0 || i % 400 == 0) && (i % 100 != 0))


        System.out.println("Year " + i + " is Leap");}


    }
}
