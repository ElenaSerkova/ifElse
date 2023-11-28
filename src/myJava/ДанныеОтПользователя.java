package myJava;

import java.util.Scanner;

public class ДанныеОтПользователя {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //обязательная строчка для получения данных от пользователя. Constant

//        System.out.println("Требуемая информация от пользователя: "); - тоже постоянная


//        String info = scan.nextLine(); // info - это то, что ввел пользыватель
//       System.out.println("Что хотим получить " + info);

        // выше мы получили информацию от пользователя

        // для получения чисел, символов и строк от пользователя:

       // int num1 = scan.nextInt();
       // byte num2 = scan.nextByte();
       // boolean b = scan.nextBoolean();
        // float num3 = scan.nextFloat();
       // double num4 = scan.nextDouble();
        //  String stroka = scan.nextLine();

        double num1 = 50, num2 = 11;
        double result = num1 + num2;
        result -= 10;
        System.out.println("Результат сложения: " + result);

        result = num1 / num2;
        result++;
        System.out.println("Результат деления: " + result);

        result = num1 - num2;
        result += 10; //сокращенная версия для изменения результата
        System.out.println("Результат вычитания: " + result);

        result = num1 * num2 - 11; //полная версия для изменения результата
        //result -= 10; //сокращенная версия n1 для изменения результата
        //result = result - 10; //сокращенная версия n2 для изменения результата
        //result++ увеличение на 1
        //result-- уменьшение на 1
        System.out.println("Результат умножения: " + result);

        result = num1 % num2;
        System.out.println("Результат умножения: " + result);





    }

}
