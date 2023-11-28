package lesson03;

public class CatConst {
    String name;
    int age;
    String breed;

    public CatConst(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "CatConstructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    public void Date(){
        System.out.println("My nane is " + name + ". My age is " + age + ". And i am " + breed + ".");
    }
}
