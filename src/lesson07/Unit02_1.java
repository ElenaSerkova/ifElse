package lesson07;

import java.util.Scanner;

public class Unit02_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isPrime = true;
        int x;

        System.out.println("The computer will check if the number is prime");
        x = scan.nextInt();

        for (int i = 2; i <= 100; i++){
            isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Number " + x + " is prime!");
            } else {
                System.out.println("Number " + x + " is complex!");
            }
            }

        }
    }

