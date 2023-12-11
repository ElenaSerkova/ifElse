package lesson04;

public class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Sony");

        System.out.println(robot1.mark);

        Robot robot2 = new Robot("Huawei");

        System.out.println(robot2.mark);


        robot1.hello();
        robot2.hello();

        double euroVaiue = robot1.currencyConverter(100);       //1 метод
        System.out.println("Из 100 долларов мы получим " + euroVaiue + " евро");

        double euroVaiue1 = robot1.currencyConverter(100, 0.99); //2 метод
        System.out.println("Из 100 долларов мы получим " + euroVaiue1 + " евро");

        float euro = robot2.Convertation(50); //2 метод
        System.out.println("Из 50 Usa мы получим " + euro + " Euro");

        }
    }