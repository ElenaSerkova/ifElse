package addHomework3;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first integer number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second integer number: ");
        int num2 = scan.nextInt();

        if (num1 == num2){
            System.out.println("Numbers are equal");
        } else if (num1 != num2) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Error");
        }
    }
}
