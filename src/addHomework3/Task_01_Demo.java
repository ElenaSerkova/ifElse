package addHomework3;

public class Task_01_Demo {
    public static void main(String[] args) {

        Task_0_1 person1 = new Task_0_1("Tom", 37, 89.5, "Trainer", true);
        Task_0_1 person2 = new Task_0_1("Bob", 29, 79.7, "Driver", false);

        System.out.println(person1);
        System.out.println(person2);

        person1.tom();
        person2.bob();
    }

}
