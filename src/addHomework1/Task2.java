package addHomework1;

import java.util.Scanner;

//Написать консольную программу, которая запрашиваетимя пользователя и выводит на консоль текст:
// Hello имя пользователя!
public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name, please");
        String name = scan.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
