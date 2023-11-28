package lesson03;

public class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Graf";
        myDog.age = 3;
        myDog.breed = "Labrador";

        myDog.gaf();
        myDog.happyBirthDay();
    }
}
