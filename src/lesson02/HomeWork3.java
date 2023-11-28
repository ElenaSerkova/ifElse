package lesson02;
/*
   Задача 3.
Дано трехзначное число (произвольное).
Создать три переменные в которые с помощью математических действий
присвоить цифры этого числа
Вывести на экран все переменные (не напечатать цифры, а именно
получить значения переменных).

Пример: 345
Вывод в консоль: Число 345 -> 3, 4, 5
    */
public class HomeWork3 {
    public static void main(String[] args) {

        int num = 34567;

        int digit1 = num % 10000;
        int digit2 = digit1 % 1000;
        int digit3 = digit2 % 100;
        int digit4 = digit3 % 10;
        int digit5 = num / 10000;

        String numberStr = String.valueOf(num);

        System.out.println(numberStr);

        System.out.println("1 цифра числа: " + numberStr.charAt(0));
        System.out.println("2 цифра числа: " + numberStr.charAt(1));
        System.out.println("3 цифра числа: " + numberStr.charAt(2));
        System.out.println("4 цифра числа: " + numberStr.charAt(3));
        System.out.println("5 цифра числа: " + numberStr.charAt(4));

        System.out.print(numberStr.charAt(0) + " , " + numberStr.charAt(1) + " , " + numberStr.charAt(2) + " , " + numberStr.charAt(3) + " , " + numberStr.charAt(4) );
    }
}
