package lesson06;

import java.util.Scanner;

public class Расчет {

        public static void main(String[] args) {
            int x;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число от 0 до 1000: ");
            x = scanner.nextInt();

            if (x <= 10) {
                System.out.println("Долеко. Попробуй снова!");
            } else if (x <= 100) {
                System.out.println("Уже ближе!");
            } else if (x <= 1000) {
                System.out.println("Совсем близко");
            }
        }}

