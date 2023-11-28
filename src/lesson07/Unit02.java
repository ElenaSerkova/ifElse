package lesson07;

import java.util.Random;
import java.util.Scanner;

public class Unit02 {
    //2. проверить является ли число которое ввел пользователь - простым ***(у меня проверка на четное или нечетное)
    //(делится без остатка только на 1 и на себя)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("The computer will check if the number is prime");
        boolean isEvent = false;
        int x = 0;
        int i = 2;
        x = scan.nextInt();


        while (i <= x / 2) {

            if (x % i == 0)
            isEvent = true;
            ++i;
            if (!isEvent)
            {
                System.out.println("Number " + x + " is event!");
            }

        else {
                System.out.println("Number " + x + " is odd!");
            }


        }}}



