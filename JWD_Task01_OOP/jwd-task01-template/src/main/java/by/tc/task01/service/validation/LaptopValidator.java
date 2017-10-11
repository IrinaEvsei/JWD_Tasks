package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class LaptopValidator{

	public static boolean criteriaValidator(Criteria<SearchCriteria.Laptop> criteria) {
		try {
			for (Map.Entry<String, String> searchCriteria : criteria.getCriteriaAsMap().entrySet()) {
				String searchProperty = searchCriteria.getKey();
				String searchValue = searchCriteria.getValue();
				if (!SearchCriteria.Laptop.containsProperty(searchProperty)) {
					return false;
				}

				if (SearchCriteria.Laptop.BATTERY_CAPACITY.isProperty(searchProperty)) {
					Validator.validateDoubleNumber(searchProperty, searchValue, 0);
				}
				if (SearchCriteria.Laptop.OS.isProperty(searchProperty)) {
					Validator.validateString(searchProperty, searchValue);
				}
				if (SearchCriteria.Laptop.MEMORY_ROM.isProperty(searchProperty)) {
					Validator.validateIntegerNumber(searchProperty, searchValue, 0);
				}
				if (SearchCriteria.Laptop.SYSTEM_MEMORY.isProperty(searchProperty)) {
					Validator.validateIntegerNumber(searchProperty, searchValue, 0);
				}
				if (SearchCriteria.Laptop.CPU.isProperty(searchProperty)) {
					Validator.validateDoubleNumber(searchProperty, searchValue, 0);
				}
				if (SearchCriteria.Laptop.DISPLAY_INCHS.isProperty(searchProperty)) {
					Validator.validateIntegerNumber(searchProperty, searchValue, 0);
				}
			}
		} catch (Exception ex) {
			System.out.println("Laptop criteria has validation error:" + ex.getMessage());
			return false;
		}
		return true;
	}
}

