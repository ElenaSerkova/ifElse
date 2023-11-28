package lesson05;

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter the action: ");
        String action = scan.nextLine();
        action = scan.nextLine(); //дополнительная строчка для корректного отображения

        double res;

        switch (action){
            case "+":
                res = num1 + num2;
                System.out.println("Addition result is " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Substraction result is " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Multiplication result is " + res);
                break;
            case "/":
                if (num1 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Division result is " + res);
                    break;
                }
            default:
                System.out.println("Have a nice day!");
        }
    }
}
