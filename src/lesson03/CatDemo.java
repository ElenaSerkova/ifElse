package lesson03;

import java.util.concurrent.Callable;

public class CatDemo {

    public static void main(String[] args) {
        Cat myCat2 = new Cat("Vasiliy");
        System.out.println(myCat2.name);

        Cat myCat3 = new Cat("Pechenushka", 1);
        System.out.println(myCat3.name);
        System.out.println(myCat3.age);

        Cat myCat4 = new Cat("Keksik", 3, "Brit");
        System.out.println(myCat4.name);
        System.out.println(myCat4.age);
        System.out.println(myCat4.breed);

    }
}
