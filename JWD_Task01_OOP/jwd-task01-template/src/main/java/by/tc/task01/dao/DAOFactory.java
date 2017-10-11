package by.tc.task01.dao;

import by.tc.task01.dao.impl.*;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	private final ApplianceDAO tabletPCDAO = new TabletPCDAOImpl();
	private final ApplianceDAO speakersDAO = new SpeakersDAOImpl();
	private final ApplianceDAO ovenDAO = new OvenDAOImpl();
	private final ApplianceDAO laptopDAO =new LaptopDAOImpl();
	private final ApplianceDAO refrigeratorDAO =new RefrigeratorDAOImpl();
	private final ApplianceDAO vacuumCleanerDAO =new VacuumCleanerDAOImpl();

	private DAOFactory() {}

	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	public ApplianceDAO getTabletPCDAO() {
		return tabletPCDAO;
	}

	public ApplianceDAO getSpeakersDAO() {
		return speakersDAO;
	}

	public ApplianceDAO getOvenDAO() {return  ovenDAO;}

	public ApplianceDAO getLaptopDAO() {return laptopDAO;}

	public ApplianceDAO getRefrigeratorDAO() {return refrigeratorDAO;}

	public ApplianceDAO getVacuumCleanerDAO() {return vacuumCleanerDAO;}

	public static DAOFactory getInstance() {return instance; }

}
