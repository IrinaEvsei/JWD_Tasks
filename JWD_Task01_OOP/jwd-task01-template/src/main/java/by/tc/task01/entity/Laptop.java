package by.tc.task01.entity;

public class Laptop extends Appliance{

    //--------------------------------------------------
    private double batteryCapacity;
    private String os;
    private int memoryROM;
    private int systemMemory;
    private double cpu;
    private int displayInchs;

    public Laptop() {}

    public Laptop(double batteryCapacity, String os, int memoryROM, int systemMemory, double cpu, int displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

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

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) != 0) return false;
        if (getMemoryROM() != laptop.getMemoryROM()) return false;
        if (getSystemMemory() != laptop.getSystemMemory()) return false;
        if (Double.compare(laptop.getCpu(), getCpu()) != 0) return false;
        if (getDisplayInchs() != laptop.getDisplayInchs()) return false;
        return getOs().equals(laptop.getOs());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getBatteryCapacity());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getOs().hashCode();
        result = 31 * result + getMemoryROM();
        result = 31 * result + getSystemMemory();
        temp = Double.doubleToLongBits(getCpu());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getDisplayInchs();
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryROM=" + memoryROM +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                '}';
    }

    public void electric(){append(" Laptop is not an electrical appliance.\n");}
    public void electronic(){super.electronic();}

//--------------------------------------------------

    // you may add your own code here
}
