package lesson15;

import java.util.Scanner;
//Напишите программу, которая определит, сколько слов Вы ввели с консоли.

public class Task3_Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String text = scan.nextLine();


    String[] array = text.split(" ");

        System.out.println("You enter " + array.length + " words.");

}}
