package lesson07;

import java.util.Scanner;

public class Unit02_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();

        boolean isSimple = true;

        System.out.println("The computer will check if the number is prime");
        x = scan.nextInt();


                for (int i = 2; i < x / 2 ; i++) {
                    if (x % i == 0) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                }

    }}}

