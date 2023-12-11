package addHomework1;

//Напишите программу, которая запрашивает у пользователя целое число
// и печатает на консоль таблицу умножения для этого числа до 10.
// Test Data: Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24...
// 8 x 10 = 80

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your integer number: " );
        int num = scan.nextInt();

        int res1 = num * 1;
        int res2 = num * 2;
        int res3 = num * 3;
        int res4 = num * 4;
        int res5 = num * 5;
        int res6 = num * 6;
        int res7 = num * 7;
        int res8 = num * 8;
        int res9 = num * 9;
        int res10 = num * 10;

        System.out.println(num + " * 1 = " + res1);
        System.out.println(num + " * 2 = " + res2);
        System.out.println(num + " * 3 = " + res3);
        System.out.println(num + " * 4 = " + res4);
        System.out.println(num + " * 5 = " + res5);
        System.out.println(num + " * 6 = " + res6);
        System.out.println(num + " * 7 = " + res7);
        System.out.println(num + " * 8 = " + res8);
        System.out.println(num + " * 9 = " + res9);
        System.out.println(num + " * 10 = " + res10);

    }
}
