package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.SpeakersValidator;

public class SpeakersServiceImpl extends ApplianceServiceImpl implements ApplianceService {

    public ApplianceDAO getDAO(){
        return factory.getSpeakersDAO();
    }

    public <E> boolean criteriaValidator(Criteria<E> criteria){
        return SpeakersValidator.criteriaValidator((Criteria<SearchCriteria.Speakers>) criteria);
    }
}
