package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class OvenValidator {
    public static boolean criteriaValidator(Criteria<SearchCriteria.Oven> criteria) {
        try {
            for (Map.Entry<String, String> searchCriteria : criteria.getCriteriaAsMap().entrySet()) {
                String searchProperty = searchCriteria.getKey();
                String searchValue = searchCriteria.getValue();
                if (!SearchCriteria.Oven.containsProperty(searchProperty)) {
                    return false;
                }
                if (SearchCriteria.Oven.POWER_CONSUMPTION.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Oven.WEIGHT.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Oven.CAPACITY.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Oven.DEPTH.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Oven.HEIGHT.isProperty(searchProperty)) {
                    Validator.validateDoubleNumber(searchProperty, searchValue,0);
                }
                if (SearchCriteria.Oven.WIDTH.isProperty(searchProperty)) {
                    Validator.validateDoubleNumber(searchProperty, searchValue, 0);
                }
            }
        } catch (Exception ex) {
            System.out.println("Oven criteria has validation error:" + ex.getMessage());
            return false;
        }
        return true;
    }
}
