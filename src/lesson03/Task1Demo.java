package lesson03;

public class Task1Demo {
    public static void main(String[] args){
        Task1 myElena = new Task1("Elena", 40, "Kaluga", "Engineer","Russion", "Berlin" );

        System.out.println("My name is " + myElena.name);
        System.out.println("I am " + myElena.age);
        System.out.println("I am from " + myElena.city);
        System.out.println("I am " + myElena.profession);
        System.out.println("I speak " + myElena.language);
        System.out.println("I live in " + myElena.city2);

        myElena.Chang();
    }

    }

