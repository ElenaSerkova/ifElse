package addHomework2;

public class Task21 {

    public String name;
    public int age;
    public String color;
    public String breed;

    public Task21(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public void voice(){
        System.out.println("It is my dog " + name + ". It is " + age + " years old. It breed is " + breed + ".");
    }

    public void happyBirthDay(){
        System.out.println(name + " has today Birthday. It was " + age + "." );
        age++;
        System.out.println("Today it is " + age + "!");
    }

    public void color(){

        System.out.println("And my dog " + name + " is " + color + "!");
    }


}
