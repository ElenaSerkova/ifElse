package lesson03;

public class Task1Demo {
    public static void main(String[] args){
        Task1 myElena = new Task1();
        myElena.name = "Elena";
        myElena.age = 40;
        myElena.city = "Kaluga";
        myElena.profession = "Engineer";
        myElena.language = "Russion";
        myElena.city2 = "Berlin";


        System.out.println("My name is " + myElena.name);
        System.out.println("I am " + myElena.age);
        System.out.println("I am from " + myElena.city);
        System.out.println("I am " + myElena.profession);
        System.out.println("I speak " + myElena.language);
        System.out.println("I live in " + myElena.city2);
    }
}
