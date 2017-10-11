package by.tc.task01.entity.criteria;

import java.util.*;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	public Map<String, String> getCriteriaAsMap() {
		Map<String, String> searchCriteria = new HashMap<String, String>();
		for (Map.Entry<E, Object> searchEntry : getCriteria().entrySet()) {
			String searchProperty = searchEntry.getKey().toString();
			String searchValue = "" + searchEntry.getValue();
			searchCriteria.put(searchProperty, searchValue);
		}
		return searchCriteria;
	}
}