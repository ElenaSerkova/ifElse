package addHomework3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first integer number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second integer number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter your third integer number: ");
        int num3 = scan.nextInt();

        if (num1 == num2 & num2 == num3 & num1 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 & num2 != num3 & num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }}
