package lesson03;

public class Task22Demo {

    public static void main(String[] args){
        Task22 number = new Task22();

        int result = number.sum(0,1,2,3,4,5,6,7,8,9);
        System.out.println("Результат сложения = " + result);

        result = number.div(45, 10);
        System.out.println("Результат деления = " + result);

    }
}
