package addHomework3;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first integer number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second integer number: ");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("The greater number is " + num1);
            } else if (num1 < num2) {
            System.out.println("The greater number is " + num2);
            } else if (num1 == num2) {
            System.out.println("Your numbers are equal");
        } else {
            System.out.println("Error");
        }
    }

    }

