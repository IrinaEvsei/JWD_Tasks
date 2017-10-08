package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import static by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import static by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;


public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.CAPACITY, 3);

//----------------------------------------------------------------
        criteriaOven.add(Oven.POWER_CONSUMPTION,2500);
        criteriaOven.add(Oven.WEIGHT,25);
        criteriaOven.add(Oven.DEPTH,60);
        criteriaOven.add(Oven.HEIGHT,50);
        criteriaOven.add(Oven.WIDTH,60);
//----------------------------------------------------------------

        appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

//----------------------------------------------------------------
        criteriaOven.add(Oven.CAPACITY,5);
        criteriaOven.add(Oven.POWER_CONSUMPTION,1500);
        criteriaOven.add(Oven.WEIGHT,25);
        criteriaOven.add(Oven.WIDTH,55);
//----------------------------------------------------------------

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);

//----------------------------------------------------------------
        criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY,5);
        criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY,4);
//----------------------------------------------------------------

		appliance = service.find(criteriaOven); //WTF??????????????

		PrintApplianceInfo.print(appliance);

//----------------------------------------------------------------
        Criteria<Laptop> criteriaLaptop = new Criteria<Laptop>();
        criteriaLaptop.add(Laptop.OS, "Windows");
        criteriaLaptop.add(Laptop.MEMORY_ROM, 6000);
        criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1500);
        criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 3);
        criteriaLaptop.add(Laptop.CPU, 2.7);
        criteriaLaptop.add(Laptop.DISPLAY_INCHS, 20);

        appliance = service.find(criteriaLaptop);

        PrintApplianceInfo.print(appliance);

        criteriaLaptop = new Criteria<Laptop>();
        criteriaLaptop.add(Laptop.OS, "Linux");
        criteriaLaptop.add(Laptop.MEMORY_ROM, 7000);
        criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1700);
        criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 4);
        criteriaLaptop.add(Laptop.CPU, 2.5);
        criteriaLaptop.add(Laptop.DISPLAY_INCHS, 25);

        appliance = service.find(criteriaLaptop);

        PrintApplianceInfo.print(appliance);

        //*****************
        Criteria<Refrigerator> criteriaRefrigerator = new Criteria<Refrigerator>();
        criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION,150);
        criteriaRefrigerator.add(Refrigerator.WEIGHT,35);
        criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY,20);
        criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY,350);
        criteriaRefrigerator.add(Refrigerator.HEIGHT,180);
        criteriaRefrigerator.add(Refrigerator.WIDTH,75);

        appliance = service.find(criteriaRefrigerator);

        PrintApplianceInfo.print(appliance);

        //*****************
        Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>();
        criteriaSpeakers.add(Speakers.POWER_CONSUMPTION,15);
        criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS,2);
        criteriaSpeakers.add(Speakers.CORD_LENGTH,2);
        criteriaSpeakers.add(Speakers.FREQUENCY_RANGE,"2-4");

        appliance = service.find(criteriaSpeakers);

        PrintApplianceInfo.print(appliance);

        //******************
        Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<VacuumCleaner>();
        criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION,110);
        criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE,"B");
        criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE,"AA-89");
        criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE,"all-in-one");
        criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION,2900);
        criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH,25);

        appliance = service.find(criteriaVacuumCleaner);

        PrintApplianceInfo.print(appliance);

//----------------------------------------------------------------
	}
}