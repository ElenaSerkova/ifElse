package addHomework3;

public class Task_0_1 {

    public String name;
    int age;
    double wight;
    String profession;
    boolean family;

    public Task_0_1(String name, int age, double wight, String profession, boolean family) {
        this.name = name;
        this.age = age;
        this.wight = wight;
        this.profession = profession;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Task_0_1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wight=" + wight +
                ", profession='" + profession + '\'' +
                ", family=" + family +
                '}';
    }

    void tom (){
        System.out.println(name + " is a football fan!");
    }

    void bob (){
        System.out.println(name + " is friend of Tom");
    }
}
