package by.tc.task01.entity;

public class Laptop extends Appliance{

    private double batteryCapacity;
    private String os;
    private int memoryROM;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    public Laptop(String name) {super(name);}

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("Battery capacity").append(" = ").append(getBatteryCapacity()).append(" ");
        builder.append("OS").append(" = ").append(getOs()).append(" ");
        builder.append("MemoryROM").append(" = ").append(getMemoryROM()).append(" ");
        builder.append("System memory").append(" = ").append(getSystemMemory()).append(" ");
        builder.append("CPU").append(" = ").append(getCpu()).append(" ");
        builder.append("Display Inches").append(" = ").append(getDisplayInches()).append(" ");
        return builder.toString();
    }
}