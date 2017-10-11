package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

	public static void print(Appliance appliance) {
		if (appliance != null) {
			System.out.println(appliance.toString());
		} else {
			System.out.println("There is no such appliance.");
		}
	}

	public static void printList(List<Appliance> appliances) {
		if (!appliances.isEmpty()) {
			for (Appliance appliance : appliances){
				print(appliance);
			}
		} else {
			System.out.println("There is no such appliances.");
		}
	}
}