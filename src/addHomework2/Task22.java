package addHomework2;

public class Task22 {

    public String name;
    public String color;

    public Task22(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Task22{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    void dog(){
        System.out.println("My dog's name is " + name + ". It is " + color + "." );
    }



}

