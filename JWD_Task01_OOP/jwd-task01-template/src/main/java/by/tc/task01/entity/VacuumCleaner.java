package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(String name) {super(name);}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("Power consumption").append(" = ").append(getPowerConsumption()).append(" ");
        builder.append("Filter type").append(" = ").append(getFilterType()).append(" ");
        builder.append("Bag type").append(" = ").append(getBagType()).append(" ");
        builder.append("Wand type").append(" = ").append(getWandType()).append(" ");
        builder.append("Motor speed regulation").append(" = ").append(getMotorSpeedRegulation()).append(" ");
        builder.append("Cleaning width").append(" = ").append(getCleaningWidth()).append(" ");
        return builder.toString();
    }
}