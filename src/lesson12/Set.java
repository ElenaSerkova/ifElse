package lesson12;

public class Set {


    String tool1;
    String tool2;

    public Set(String tool1, String tool2) {
        this.tool1 = tool1;
        this.tool2 = tool2;
    }

    @Override
    public String toString() {
        return "Set{" +
                "tool1='" + tool1 + '\'' +
                ", tool2='" + tool2 + '\'' +
                '}';
    }

    public String getTool1() {
        return tool1;
    }

    public void setTool1(String tool1) {
        this.tool1 = tool1;
    }

    public String getTool2() {
        return tool2;
    }

    public void setTool2(String tool2) {
        this.tool2 = tool2;
    }
}
