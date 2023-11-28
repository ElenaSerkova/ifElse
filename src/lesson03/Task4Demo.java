package lesson03;

public class Task4Demo {
    public static void main(String[] args) {
        Task4 weather = new Task4();

        int result = weather.sum(7, 6, 7, 8, 7, 5, 9);
        System.out.println("Средняя температура за неделю = " + result / 7);



    }
}