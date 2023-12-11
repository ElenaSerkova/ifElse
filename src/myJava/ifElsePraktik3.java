package myJava;

import java.util.Scanner;

public class ifElsePraktik3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = scan.nextLine();

        if (message.equals("Elena")){
            System.out.println("Hello " + message);
            System.out.println("Have a nice day!");
        } else if (message.equals("I am tired")) {
            System.out.println("You need relax");
        }else {
            System.out.println("I don't now you");
        }
    }
}
