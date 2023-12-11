package lesson15;

import java.util.Scanner;

//Напишите программу, которая определит, сколько слов Вы ввели с консоли.
public class Task3_String {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = scan.nextLine();
        int count = 1;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' '){
                    count++;
                    }}

                    System.out.println("You enter " + count + " words.");

            }}






