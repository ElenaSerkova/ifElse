package myJava;

import java.util.Scanner;

public class ifElsePraktik2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your role: ");
        String role = scan.nextLine();
        System.out.println("Your pass: ");
        String pass = scan.nextLine();

        if (role.equals("Director") || role.equals("director") && pass.equals("7891")) { //для строки String всегда используем equels
            System.out.println("Hello director! A list of employees is here!");}
            else if (role.equals("Employee") || role.equals("employee") && pass.equals("123456")) {
            System.out.println("What is your name?");
            String name = scan.nextLine();
            System.out.println("Hello " + name + "! Your schedule for today is here!");
            } else {
            System.out.println("Are you a new employee? You need your pass." + "\n" + "If you entered the pass incorrectly, try again!" );

            }
        }
    }

