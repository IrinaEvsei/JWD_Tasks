package by.tc.task01.entity;

public class Appliance {

    private String name;

    public Appliance() {
    }

    public Appliance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Appliance Name").append(" - ").append(getName()).append(" ");
        return builder.toString();
    }
}