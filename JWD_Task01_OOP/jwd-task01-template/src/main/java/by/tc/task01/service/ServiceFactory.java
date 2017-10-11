package by.tc.task01.service;

import by.tc.task01.service.impl.*;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new TabletPCServiceImpl();

	private final ApplianceService tabletPCService = new TabletPCServiceImpl();

	private final ApplianceService speakersService = new SpeakersServiceImpl();

	private final ApplianceService ovenService = new OvenServiceImpl();

	private final ApplianceService laptopService = new LaptopServiceImpl();

	private final ApplianceService refrigeratorService = new RefrigeratorServiceImpl();

	private final ApplianceService vacuumCleanerService = new VacuumCleanerServiceImpl();

	private ServiceFactory() {}

	public ApplianceService getApplianceService() {
		return applianceService;
	}

	public ApplianceService getTabletPCService() {
		return tabletPCService;
	}

	public ApplianceService getSpeakersService() {
		return speakersService;
	}

	public ApplianceService getOvenService() {
		return ovenService;
	}

	public ApplianceService getLaptopService() {return  laptopService;}

	public ApplianceService getRefrigeratorService() {return  refrigeratorService;}

	public ApplianceService getVacuumCleanerService() {return  vacuumCleanerService;}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
