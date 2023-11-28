package lesson03;

public class Task6Demo {

    public static void main(String[] args){
        Task6 myTask6 = new Task6();
        myTask6.age = 3;


        System.out.println("Было " + myTask6.age);

        myTask6.happyBirthDay();
        System.out.println("Стало " + myTask6.age);
    }
}
