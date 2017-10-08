package by.tc.task01.entity;

public class Appliance {

//--------------------------------
    private String s = "Appliance : ";
    public void append(String a){s+=a;}
    public void electronic(){append(" [electronic appliance] ");}
    public void electric(){append(" [electric appliance] ");}
    public String toString(){return s;}
//--------------------------------

	// you may add your own code here
}
