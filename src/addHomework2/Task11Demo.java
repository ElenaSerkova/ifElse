package addHomework2;

public class Task11Demo {

    public static void main(String[] args) {

        Task11 robot1 = new Task11("Robert", "SONY", "Cleaning");
        Task11 robot2 = new Task11("Robo", "Samsung", "Washing");
        Task11 robot3 = new Task11("Bob", "Acer", "Count");

        robot1.hello();
        robot1.prod();
        robot1.roboUse();

        System.out.println("================================================");

        robot2.hello();
        robot2.prod();
        robot2.roboUse();

        System.out.println("================================================");

        robot3.hello();
        robot3.prod();
        robot3.roboUse();
    }
}
