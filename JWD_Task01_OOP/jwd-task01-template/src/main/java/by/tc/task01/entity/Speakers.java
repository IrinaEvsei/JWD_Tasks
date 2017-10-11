package by.tc.task01.entity;

public class Speakers extends Appliance{

    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers(String name) {
        super(name);
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("Power consumption").append(" = ").append(getPowerConsumption()).append(" ");
        builder.append("Number of speakers").append(" = ").append(getNumberOfSpeakers()).append(" ");
        builder.append("Frequency range").append(" = ").append(getFrequencyRange()).append(" ");
        builder.append("Cord length").append(" = ").append(getCordLength()).append(" ");
        return builder.toString();
    }
}