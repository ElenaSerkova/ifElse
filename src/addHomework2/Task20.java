package addHomework2;

public class Task20 {
    public String name;
    public int age;

    public Task20(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void name(){
        System.out.println("It is my dog " + name);
        System.out.println("It is " + age + " years old");
    }

    public void happyBirthDay(){
        System.out.println(name + " has today birthday");
        System.out.println(name + " was " + age + " years old");
        age++;
        System.out.println("Today is " + name + " " + age + " years old! Happy birthday, " + name + "!");

    }

    public void wow(){
        System.out.println("Wow! Wow! Wow!");
    }
}
