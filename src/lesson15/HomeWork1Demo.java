package lesson15;

import java.util.Arrays;

public class HomeWork1Demo {
    public static void main(String[] args) {
        HomeWork1 names1 = new HomeWork1("Elena");
        HomeWork1 names2 = new HomeWork1("Denis");
        HomeWork1 names3 = new HomeWork1("Alex");

        HomeWork1 [] names = {names1, names2, names3};

        System.out.println(Arrays.toString(names));

        HomeWork1ArraySort sortHomeWork1 = new HomeWork1ArraySort();
        sortHomeWork1.bubbleSort(names);

        System.out.println(Arrays.toString(names));
    }
}
