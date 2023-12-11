package addHomework2;

import lesson04.Robot;

public class Task1Demo {
    public static void main(String[] args) {

        Task1 robot1 = new Task1("Robert");
        System.out.println(robot1.name);

        Task1 robot2 = new Task1("Robo");
        System.out.println(robot2.name);

        robot1.sayHello();
        robot1.sayYourName();

        robot2.sayHello();
        robot2.sayYourName();


    }

}
