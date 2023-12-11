package addHomework2;

public class Task11 {

    public String name;
    public String producer;
    public String use;

    public Task11(String name, String producer, String use) {
        this.name = name;
        this.producer = producer;
        this.use = use;
    }

    @Override
    public String toString() {
        return "Task11{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", use='" + use + '\'' +
                '}';
    }

    public void hello(){
        System.out.println("Hello! My name is " + name);
    }

    public void roboUse(){
        System.out.println("You can me use for " + use);
    }

    public void prod(){
        System.out.println("My producer is " + producer);
    }
}
