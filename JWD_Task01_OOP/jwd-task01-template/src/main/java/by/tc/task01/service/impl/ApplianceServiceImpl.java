package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	public static final DAOFactory factory = DAOFactory.getInstance();

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		if (!criteriaValidator(criteria)) {
			return null;
		}

		ApplianceDAO applianceDAO = getDAO();
		return applianceDAO.find(criteria);
	}

	@Override
	public <E> List<Appliance> findList(Criteria<E> criteria) {
		if (!criteriaValidator(criteria)) {
			return null;
		}

		ApplianceDAO applianceDAO = getDAO();
		return applianceDAO.findList(criteria);
	}

	public ApplianceDAO getDAO(){
		return factory.getApplianceDAO();
	}

	public <E> boolean criteriaValidator(Criteria<E> criteria){
		return Validator.criteriaValidator(criteria);
	}
}