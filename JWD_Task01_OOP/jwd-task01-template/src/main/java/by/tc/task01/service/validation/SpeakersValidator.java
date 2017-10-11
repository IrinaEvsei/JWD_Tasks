package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class SpeakersValidator {
    public static boolean criteriaValidator(Criteria<SearchCriteria.Speakers> criteria) {
        try {
            for (Map.Entry<String, String> searchCriteria : criteria.getCriteriaAsMap().entrySet()) {
                String searchProperty = searchCriteria.getKey();
                String searchValue = searchCriteria.getValue();
                if (!SearchCriteria.Speakers.containsProperty(searchProperty)) {
                    return false;
                }
                if (SearchCriteria.Speakers.POWER_CONSUMPTION.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
                if (SearchCriteria.Speakers.FREQUENCY_RANGE.isProperty(searchProperty)) {
                    Validator.validateString(searchProperty, searchValue);
                }
                if (SearchCriteria.Speakers.CORD_LENGTH.isProperty(searchProperty)) {
                    Validator.validateIntegerNumber(searchProperty, searchValue, 0);
                }
            }
        } catch (Exception ex) {
            System.out.println("Speakers criteria has validation error:" + ex.getMessage());
            return false;
        }
        return true;
    }
}
