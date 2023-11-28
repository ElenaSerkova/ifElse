package lesson06;

import java.util.Scanner;

public class Прибор {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите данные первой колбы в градусах Цельсия: ");
        int Temperature1 = scan.nextInt();
        System.out.println("Введите данные второго колбы в градусах Цельсия: ");
        int Temperature2 = scan.nextInt();

        if (Temperature1 >= 100 && Temperature2 <  100){
            System.out.println("True. Прибор работает корректно.");
        } else if (Temperature1 < 100 && Temperature2 >=  100) {
            System.out.println("False. Внимание!!! Прибор работает не корректно.");
        } else {
            System.out.println("Данные введены не корректно!");
        }


    }
}



