package by.tc.task01.main;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import static by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = null;

		//////////////////////////////////////////////////////////////////

		service = factory.getOvenService();

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.CAPACITY, 32);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		service = factory.getTabletPCService();

		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

		service = factory.getLaptopService();

		Criteria<Laptop> criteriaLaptop = new Criteria<Laptop>();
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1000);
		criteriaLaptop.add(Laptop.OS, "Windows");

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);

		service = factory.getRefrigeratorService();

		Criteria<Refrigerator> criteriaRefrigerator = new Criteria<Refrigerator>();
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 180);
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 15);

		appliance = service.find(criteriaRefrigerator);

		PrintApplianceInfo.print(appliance);

		service = factory.getVacuumCleanerService();

		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<VacuumCleaner>();
		criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION, 110);
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "B");

		appliance = service.find(criteriaVacuumCleaner);

		PrintApplianceInfo.print(appliance);

		service = factory.getSpeakersService();

		Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>();
		criteriaSpeakers.add(Speakers.POWER_CONSUMPTION, 15);
		criteriaSpeakers.add(Speakers.CORD_LENGTH, 2);

		appliance = service.find(criteriaSpeakers);

		PrintApplianceInfo.print(appliance);
	}
}