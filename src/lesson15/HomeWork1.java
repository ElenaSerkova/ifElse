package lesson15;

public class HomeWork1 {
    String name;

    public HomeWork1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HomeWork1{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
