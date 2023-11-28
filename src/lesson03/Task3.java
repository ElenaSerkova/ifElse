package lesson03;

import java.util.Scanner;

public class Task3 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наименование товара, который хотите приобрести: ");
        String product = scanner.nextLine();

        if (product.equals("AB") || product.equals("A B") || product.equals("ab") || product.equals("a b") || product.equals("A,B") || product.equals("A, B") || product.equals("a,b") || product.equals("a, b")) {
            System.out.println("Сумма вашего заказа 1900 руб.");
            System.out.println("Ваша скидка составляет 100 руб.");
        } else if (product.equals("A") || product.equals("a")) {
            System.out.println("Сумма вашего заказа 1500 руб.");
        } else if (product.equals("B") || product.equals("b")) {
            System.out.println("Сумма вашего заказа 500 руб.");
        } else {
            System.out.println("Errer");
        }}}



