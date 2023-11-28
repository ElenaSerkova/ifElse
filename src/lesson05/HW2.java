package lesson05;

import java.util.Scanner;

/* Введите 2 слова, используйте сканер.
         Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
         Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.
         Распечатать на консоль.

 */
public class HW2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.nextLine();
        System.out.println("Enter second word: ");
        String word2 = scan.nextLine();
        System.out.println("You words are: " + word1 + " and " + word2);

        String text1 = "home";
        String text2 = "kitchen";

        String substringText1 = text1.substring(0, 2);
        String substringText2 = text2.substring(3, 7);
        System.out.println(substringText1 + substringText2);




    }
}
