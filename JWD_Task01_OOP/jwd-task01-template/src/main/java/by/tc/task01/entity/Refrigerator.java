package by.tc.task01.entity;

public class Refrigerator extends Appliance {

    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private int overallCapacity;
    private int height;
    private int width;

    public Refrigerator(String name) {super(name);}

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

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("Power consumption").append(" = ").append(getPowerConsumption()).append(" ");
        builder.append("Weight").append(" = ").append(getWeight()).append(" ");
        builder.append("Freezer capacity").append(" = ").append(getFreezerCapacity()).append(" ");
        builder.append("Overall capacity").append(" = ").append(getOverallCapacity()).append(" ");
        builder.append("Height").append(" = ").append(getHeight()).append(" ");
        builder.append("Width").append(" = ").append(getWidth()).append(" ");
        return builder.toString();
    }
}