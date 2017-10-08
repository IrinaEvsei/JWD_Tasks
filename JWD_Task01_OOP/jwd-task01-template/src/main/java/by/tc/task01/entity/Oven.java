package by.tc.task01.entity;

public class Oven extends Appliance{
    //--------------------------------------------------
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven() {}

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oven oven = (Oven) o;

        if (getPowerConsumption() != oven.getPowerConsumption()) return false;
        if (getWeight() != oven.getWeight()) return false;
        if (getCapacity() != oven.getCapacity()) return false;
        if (getDepth() != oven.getDepth()) return false;
        if (Double.compare(oven.getHeight(), getHeight()) != 0) return false;
        return Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getPowerConsumption();
        result = 31 * result + getWeight();
        result = 31 * result + getCapacity();
        result = 31 * result + getDepth();
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public void electric(){super.electric();}
    public void electronic(){append(" Oven is not an electronic appliance.\n");}

    //--------------------------------------------------

    // you may add your own code here
}
