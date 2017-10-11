package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class VacuumCleanerValidator {
    public static boolean criteriaValidator(Criteria<SearchCriteria.VacuumCleaner> criteria) {
        try {
            for (Map.Entry<String, String> searchCriteria : criteria.getCriteriaAsMap().entrySet()) {
                String searchProperty = searchCriteria.getKey();
                String searchValue = searchCriteria.getValue();
                if (!SearchCriteria.VacuumCleaner.containsProperty(searchProperty)) {
                    return false;
                }
                if (SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.VacuumCleaner.FILTER_TYPE.isProperty(searchProperty)) {
                    Validator.validateString(searchProperty, searchValue);
                }
                if (SearchCriteria.VacuumCleaner.BAG_TYPE.isProperty(searchProperty)) {
                    Validator.validateString(searchProperty, searchValue);
                }
                if (SearchCriteria.VacuumCleaner.WAND_TYPE.isProperty(searchProperty)) {
                    Validator.validateString(searchProperty, searchValue);
                }
                if (SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.VacuumCleaner.CLEANING_WIDTH.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue,0);
                }
            }
        } catch (Exception ex) {
            System.out.println("VacuumCleaner criteria has validation error:" + ex.getMessage());
            return false;
        }
        return true;
    }
}