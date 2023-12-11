package addHomework3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first integer number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second integer number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter your third integer number: ");
        int num3 = scan.nextInt();

        if (num1 > num2 & num2 > num3) {
            System.out.println("Numbers are in increasing");
        } else if (num3 > num2 & num2 > num1) {
            System.out.println("Numbers are in decreasing");
        } else {
            System.out.println("Neither increasing or decreasing");
        }
    }
}
