package lesson07;

import java.util.Scanner;

/*Task 3 Программа просит пользователя слово "hello" Если пользователь вводит правильное слово -
программа распечатывает на экран благодарность и завершает работу Если вводится не верное слово -
программа просит ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово
*/
public class Task3_1 {
    public static void main(String[] args) {
        boolean word = true;

        while (word){
            System.out.println("Pleas enter word 'Hello'");

            Scanner scan = new Scanner(System.in);
            String userWord = scan.nextLine();

            if (userWord.equals("Hello") || userWord.equals("hello") ){
                System.out.println("Thank you!");
                break;
            }else {
                System.out.println("Try again");
            }
        }
        }
    }

