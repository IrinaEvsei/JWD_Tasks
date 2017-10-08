package by.tc.task01.entity;

public class TabletPC extends Appliance{
    //--------------------------------------------
    private int batteryCapacity;
    private int displayInchs;
    private int memoryROM;
    private int flashMemoryCApacity;
    private String color;

    public TabletPC() {}

    public TabletPC(int batteryCapacity, int displayInchs, int memoryROM, int flashMemoryCApacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInchs = displayInchs;
        this.memoryROM = memoryROM;
        this.flashMemoryCApacity = flashMemoryCApacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCApacity() {
        return flashMemoryCApacity;
    }

    public void setFlashMemoryCApacity(int flashMemoryCApacity) {
        this.flashMemoryCApacity = flashMemoryCApacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (getBatteryCapacity() != tabletPC.getBatteryCapacity()) return false;
        if (getDisplayInchs() != tabletPC.getDisplayInchs()) return false;
        if (getMemoryROM() != tabletPC.getMemoryROM()) return false;
        if (getFlashMemoryCApacity() != tabletPC.getFlashMemoryCApacity()) return false;
        return getColor().equals(tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        int result = getBatteryCapacity();
        result = 31 * result + getDisplayInchs();
        result = 31 * result + getMemoryROM();
        result = 31 * result + getFlashMemoryCApacity();
        result = 31 * result + getColor().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInchs=" + displayInchs +
                ", memoryROM=" + memoryROM +
                ", flashMemoryCApacity=" + flashMemoryCApacity +
                ", color='" + color + '\'' +
                '}';
    }

    public void electric(){append(" TabletPC is not an electrical appliance.\n");}
    public void electronic(){super.electronic();}


    //--------------------------------------------

    // you may add your own code here
}
