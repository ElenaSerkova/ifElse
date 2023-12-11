package addHomework1;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
// радиус круга (вещественное число) и печатает на консоль
// периметр и площадь круга.
// Test Data:Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586
public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double radius = scan.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = Math.PI * 2 * radius;

        System.out.println("Perimeter is: " + perimeter );
        System.out.println("Area is " + area);


    }
}
