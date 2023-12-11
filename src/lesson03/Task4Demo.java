package lesson03;

public class Task4Demo {
    public static void main(String[] args) {
        Task4 weather = new Task4();

        double result = weather.sum(5, 4.3, 5, 2,4.6, 9.6, 5);
        System.out.println("Средняя температура за неделю = " + result / 7 + " градусов.");



    }
}