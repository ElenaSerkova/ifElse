package lesson07;

import java.util.Scanner;

/*Task 3 Программа просит пользователя слово "hello" Если пользователь вводит правильное слово -
 программа распечатывает на экран благодарность и завершает работу Если вводится не верное слово -
 программа просит ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word 'Hello' please");
        String word = scan.nextLine();

        if (word.equals("Hello")){
            System.out.println("Thank you!");
        }else {
            System.out.println("Try again");
        }
    }
}
