package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class TabletPCValidator {
	public static boolean criteriaValidator(Criteria<SearchCriteria.TabletPC> criteria) {
		try {
			for (Map.Entry<String, String> searchCriteria : criteria.getCriteriaAsMap().entrySet()) {
				String searchProperty = searchCriteria.getKey();
				String searchValue = searchCriteria.getValue();
				if (!SearchCriteria.TabletPC.containsProperty(searchProperty)) {
					return false;
				}
				if (SearchCriteria.TabletPC.BATTERY_CAPACITY.isProperty(searchProperty)) {
					Validator.validateIntegerNumber(searchProperty, searchValue, 0);
				}
				if (SearchCriteria.TabletPC.DISPLAY_INCHES.isProperty(searchProperty)) {
					Validator.validateIntegerNumber(searchProperty, searchValue, 0);
				}
				if (SearchCriteria.TabletPC.MEMORY_ROM.isProperty(searchProperty)) {
					Validator.validateIntegerNumber(searchProperty, searchValue, 0);
				}
				if (SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.isProperty(searchProperty)) {
					Validator.validateIntegerNumber(searchProperty, searchValue, 0);
				}
				if (SearchCriteria.TabletPC.COLOR.isProperty(searchProperty)) {
					Validator.validateString(searchProperty, searchValue);
				}
			}
		} catch (Exception ex) {
			System.out.println("TabletPC criteria has validation error:" + ex.getMessage());
			return false;
		}
		return true;
	}
}