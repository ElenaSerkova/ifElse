package lesson07;

import java.util.Random;
import java.util.Scanner;

public class Unit02 {
    //2. проверить является ли число которое ввел пользователь - простым ***
    //(делится без остатка только на 1 и на себя)

public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = scan.nextInt();


        for (int i = 2; i < x / 2 ; i++) {
            if (x % i == 0) {
                System.out.println("Number " + x + " is Simple");
            } else {
                System.out.println("Number " + x + " is Compound");
        }
    }}}



