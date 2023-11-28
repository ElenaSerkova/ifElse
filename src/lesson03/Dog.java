package lesson03;

public class Dog {
    String name;
    int age;
    String breed;

    public void gaf(){
        System.out.println("Gaf!");
        System.out.println("Dog mane: " + name);
        System.out.println("Dog breed: " + breed);
    }

    public void happyBirthDay(){
        System.out.println("My Dog has today a Birthday!");
        System.out.println("He was " + age);
        age = age + 1;
        System.out.println("And now he is " + age);
    }
}
