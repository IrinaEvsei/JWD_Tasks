package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.TabletPCValidator;

public class TabletPCServiceImpl extends ApplianceServiceImpl implements ApplianceService {

    public ApplianceDAO getDAO(){
        return factory.getTabletPCDAO();
    }

    public <E> boolean criteriaValidator(Criteria<E> criteria){
        return TabletPCValidator.criteriaValidator((Criteria<SearchCriteria.TabletPC>) criteria);
    }
}
