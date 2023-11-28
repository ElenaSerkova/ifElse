package myJava;

import java.util.Scanner;

public class switchCase {
    //условная конструкция switch-case !Здесь мы проверяем на четкое значение!
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        switch (name) {
            case "Elena":
                System.out.println("Hello Elena! Have a nice day!");
                break;
            case "Denis":
                System.out.println("Hello Denis! Have a nice day!");
                break;
            case "Alex":
                System.out.println("Hello Alex! Have a nice day!");
                break;
            default: //выход из программы. Добавлять break в конце не обязательно!
                System.out.println("You are not in our family!");
                break;
            }
        }
    }

