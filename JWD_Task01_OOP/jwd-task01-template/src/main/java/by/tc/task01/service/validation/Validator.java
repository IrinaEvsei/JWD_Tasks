package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		return true;
	}

	public static boolean validateIntegerNumber(String key, String value, int minValue) throws Exception {
		try {
			Integer number = Integer.parseInt(value);
			if (number < minValue) {
				throwValidationError(key);
			}
		} catch (Exception ex) {
			throwValidationError(key);
		}
		return true;
	}

	public static boolean validateDoubleNumber(String key, String value, int minValue) throws Exception {
		try {
			Double number = Double.parseDouble(value);
			if (number < minValue) {
				throwValidationError(key);
			}
		} catch (Exception ex) {
			throwValidationError(key);
		}
		return true;
	}

	public static boolean validateString(String key, String value) throws Exception {
		try {
			if (value == null) {
				throwValidationError(key);
			}
		} catch (Exception ex) {
			throwValidationError(key);
		}
		return true;
	}

	public static void throwValidationError(String key) throws ValidationError {
		throw new ValidationError(key + " has invalid search criteria");
	}

}