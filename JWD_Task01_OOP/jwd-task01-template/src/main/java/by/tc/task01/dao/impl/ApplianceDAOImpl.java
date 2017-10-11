package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.io.File;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO{

	private static final String TABLE_NAME = "Appliance";

	private static final String TXT_DB_FILE_PATH = "src/main/resources/appliances_db.txt";
	private static final String TABLE_NAME_SEPARATOR = ":";
	private static final String TABLE_PROPERTIES_SEPARATOR = ",";
	private static final String PROPERTY_SEPARATOR = "=";

	public ApplianceDAOImpl(){
	}

	public <E> Appliance find(Criteria<E> criteria) {
		List<Appliance> appliances = findList(criteria);
		if (appliances.size() == 1) {
			return appliances.get(0);
		} else if (appliances.size() > 1) {
			System.out.println("Few records have been found");
		}
		return null;
	}

	@Override
	public <E> List<Appliance> findList(Criteria<E> criteria) {
		List<Appliance> appliances = new ArrayList<Appliance>();
		try {
			File file = new File(TXT_DB_FILE_PATH);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String dbRow = scanner.nextLine();
				if (!isEmpty(dbRow)) {
					String[] tableNameAndProperties = dbRow.split(TABLE_NAME_SEPARATOR);
					String tableName = trim(tableNameAndProperties[0]);
					String tableProperties = trim(tableNameAndProperties[1]);
					tableProperties = tableProperties.substring(0, tableProperties.length() - 1);
					if (getTableName().equals(tableName)) {
						Map<String, String> applianceProperties = new HashMap<String, String>();
						String[] properties = tableProperties.split(TABLE_PROPERTIES_SEPARATOR);
						for (String property : properties) {
							String[] propertyKeyValue = property.split(PROPERTY_SEPARATOR);
							String propertyKey = trim(propertyKeyValue[0]);
							String propertyValue = trim(propertyKeyValue[1]);
							applianceProperties.put(propertyKey, propertyValue);
						}
						if (matchCriteria(applianceProperties, criteria)) {
							appliances.add(generateAppliance(getTableName(), applianceProperties));
						}
					}
				}
			}
			scanner.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return appliances;
	}

	private <E> boolean matchCriteria(Map<String, String> properties, Criteria<E> criteria) {
		for (Map.Entry<String, String> searchEntry : criteria.getCriteriaAsMap().entrySet()) {
			String searchProperty = searchEntry.getKey();
			String searchValue = searchEntry.getValue();
			if (properties.containsKey(searchProperty)) {
				String valueFromDB = properties.get(searchProperty);
				if (!valueFromDB.equalsIgnoreCase(searchValue)) {
					return false;
				}
			} else {
				return false;
			}

		}
		return true;
	}

	public String getTableName() {
		return TABLE_NAME;
	}

	public Appliance generateAppliance(String applianceName, Map<String, String> properties) {
		return new Appliance(applianceName);
	}

	public static boolean isEmpty(String value) {
		return (value == null) || value.length() == 0;
	}

	public static String trim(String value) {
		return isEmpty(value) ? value : value.trim();
	}

}


