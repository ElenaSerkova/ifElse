package lesson03;

public class Task1 {
    String name;
    int age;
    String city;
    String profession;
    String language;
    String city2;

    public Task1(String name, int age, String city, String profession, String language, String city2) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.profession = profession;
        this.language = language;
        this.city2 = city2;
    }

    public void Chang (){
        System.out.println("My name is " + name + ". I wish you a nice day!" );
    }
}
