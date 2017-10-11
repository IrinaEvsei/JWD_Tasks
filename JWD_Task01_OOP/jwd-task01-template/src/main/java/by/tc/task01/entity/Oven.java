package by.tc.task01.entity;

public class Oven extends Appliance{

    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven(String name) {super(name);}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("Power consumption").append(" = ").append(getPowerConsumption()).append(" ");
        builder.append("Weight").append(" = ").append(getWeight()).append(" ");
        builder.append("Capacity").append(" = ").append(getCapacity()).append(" ");
        builder.append("Depth").append(" = ").append(getDepth()).append(" ");
        builder.append("Height").append(" = ").append(getHeight()).append(" ");
        builder.append("Width").append(" = ").append(getWidth()).append(" ");
        return builder.toString();
    }
}