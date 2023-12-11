package addHomework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String myName = "Elena";
        System.out.println("Hi! My name is " + myName);

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println("Glad to see you " + userName + "!");

    }

}
