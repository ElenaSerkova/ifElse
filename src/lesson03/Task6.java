package lesson03;

public class Task6 {
    int age;

    public Task6(int age) {
        this.age = age;
    }

    public void happyBirthDay() {
        System.out.println("Было " + age);
        age ++;
        System.out.println("Стало " + age);
    }
}
