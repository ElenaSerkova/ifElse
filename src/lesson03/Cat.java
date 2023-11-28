package lesson03;

public class Cat {
    String name;
    int age;
    String breed;
    String friendName1;
    String friendName2;

    public void Kitty(){
        System.out.println("My name is " + name);
    }

    public void HappyBirthDay(){
        System.out.println("Today is my Birthday!");
        System.out.println("I were " + age);
        age++;
        System.out.println("Now i am " + age);
    }

    public void Friend(){
        System.out.println("I have 2 friends: " + friendName1 + " , " + friendName2 );
    }

    public Cat(String name) {

        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String breed, String friendName1, String friendName2) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.friendName1 = friendName1;
        this.friendName2 = friendName2;


    }


}
