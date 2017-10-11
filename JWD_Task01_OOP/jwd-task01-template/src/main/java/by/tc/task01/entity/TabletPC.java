package by.tc.task01.entity;

public class TabletPC extends Appliance{

    private int batteryCapacity;
    private int displayInches;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {}

    public TabletPC(String name) {
        super(name);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("Battery capacity").append(" = ").append(getBatteryCapacity()).append(" ");
        builder.append("Display inches").append(" = ").append(getDisplayInches()).append(" ");
        builder.append("Memory ROM").append(" = ").append(getMemoryROM()).append(" ");
        builder.append("Flash memory capacity").append(" = ").append(getFlashMemoryCapacity()).append(" ");
        builder.append("Color").append(" = ").append(getColor()).append(" ");
        return builder.toString();
    }
}