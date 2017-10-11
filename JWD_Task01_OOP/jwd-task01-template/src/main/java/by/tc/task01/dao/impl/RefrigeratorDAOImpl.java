package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class RefrigeratorDAOImpl extends ApplianceDAOImpl implements ApplianceDAO {
    private static final String TABLE_NAME = "Refrigerator";

    public Refrigerator generateAppliance(String applianceName, Map<String, String> appliances) {
        Refrigerator refrigerator = new Refrigerator(applianceName);
        for (Map.Entry<String, String> mapEntry : appliances.entrySet()) {
            String propertyName = mapEntry.getKey();
            String propertyValue = mapEntry.getValue();
            if (SearchCriteria.Refrigerator.POWER_CONSUMPTION.isProperty(propertyName)) {
                refrigerator.setPowerConsumption(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Refrigerator.WEIGHT.isProperty(propertyName)) {
                refrigerator.setWeight(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Refrigerator.FREEZER_CAPACITY.isProperty(propertyName)) {
                refrigerator.setFreezerCapacity(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Refrigerator.OVERALL_CAPACITY.isProperty(propertyName)) {
                refrigerator.setOverallCapacity(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Refrigerator.HEIGHT.isProperty(propertyName)) {
                refrigerator.setHeight(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Refrigerator.WIDTH.isProperty(propertyName)) {
                refrigerator.setWidth(Integer.parseInt(propertyValue));
            }
        }
        return refrigerator;
    }

    public String getTableName() {
        return TABLE_NAME;
    }
}