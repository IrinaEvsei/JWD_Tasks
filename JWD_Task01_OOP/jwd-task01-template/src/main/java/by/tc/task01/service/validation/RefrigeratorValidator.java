package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class RefrigeratorValidator {
    public static boolean criteriaValidator(Criteria<SearchCriteria.Refrigerator> criteria) {
        try {
            for (Map.Entry<String, String> searchCriteria : criteria.getCriteriaAsMap().entrySet()) {
                String searchProperty = searchCriteria.getKey();
                String searchValue = searchCriteria.getValue();
                if (!SearchCriteria.Refrigerator.containsProperty(searchProperty)) {
                    return false;
                }
                if (SearchCriteria.Refrigerator.POWER_CONSUMPTION.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Refrigerator.WEIGHT.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Refrigerator.FREEZER_CAPACITY.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Refrigerator.OVERALL_CAPACITY.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Refrigerator.HEIGHT.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Refrigerator.WIDTH.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
            }
        } catch (Exception ex) {
            System.out.println("Refrigerator criteria has validation error:" + ex.getMessage());
            return false;
        }
        return true;
    }
}
