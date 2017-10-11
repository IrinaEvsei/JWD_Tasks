package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.Map;

public class OvenDAOImpl extends ApplianceDAOImpl implements ApplianceDAO {

    private static final String TABLE_NAME = "Oven";

    public Oven generateAppliance(String applianceName, Map<String, String> appliances) {
        Oven oven = new Oven(applianceName);
        for (Map.Entry<String, String> mapEntry : appliances.entrySet()) {
            String propertyName = mapEntry.getKey();
            String propertyValue = mapEntry.getValue();
            if (SearchCriteria.Oven.POWER_CONSUMPTION.isProperty(propertyName)) {
                oven.setPowerConsumption(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Oven.WEIGHT.isProperty(propertyName)) {
                oven.setWeight(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Oven.CAPACITY.isProperty(propertyName)) {
                oven.setCapacity(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Oven.DEPTH.isProperty(propertyName)) {
                oven.setDepth(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Oven.HEIGHT.isProperty(propertyName)) {
                oven.setHeight(Double.parseDouble(propertyValue));
            }
            if (SearchCriteria.Oven.WIDTH.isProperty(propertyName)) {
                oven.setWidth(Double.parseDouble(propertyValue));
            }
        }
        return oven;
    }

    public String getTableName() {
        return TABLE_NAME;
    }
}