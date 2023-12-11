package addHomework3;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first integer number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second integer number: ");
        int num2 = scan.nextInt();

        if (num1 < num2) {
            System.out.println("The smallest number is " + num1);
        } else if (num1 > num2) {
            System.out.println("The smallest number is " + num2);
        } else if (num1 == num2) {
            System.out.println("Your numbers are equal");
        } else {
            System.out.println("Error");
        }
    }
}