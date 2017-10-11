package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class VacuumCleanerDAOImpl extends ApplianceDAOImpl implements ApplianceDAO {
    private static final String TABLE_NAME = "VacuumCleaner";

    public VacuumCleaner generateAppliance(String applianceName, Map<String, String> appliances) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner(applianceName);
        for (Map.Entry<String, String> mapEntry : appliances.entrySet()) {
            String propertyName = mapEntry.getKey();
            String propertyValue = mapEntry.getValue();
            if (SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.isProperty(propertyName)) {
                vacuumCleaner.setPowerConsumption(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.VacuumCleaner.FILTER_TYPE.isProperty(propertyName)) {
                vacuumCleaner.setFilterType(String.valueOf(propertyValue));
            }
            if (SearchCriteria.VacuumCleaner.BAG_TYPE.isProperty(propertyName)) {
                vacuumCleaner.setBagType(String.valueOf(propertyValue));
            }
            if (SearchCriteria.VacuumCleaner.WAND_TYPE.isProperty(propertyName)) {
                vacuumCleaner.setWandType(String.valueOf(propertyValue));
            }
            if (SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.isProperty(propertyName)) {
                vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.VacuumCleaner.CLEANING_WIDTH.isProperty(propertyName)) {
                vacuumCleaner.setCleaningWidth(Integer.parseInt(propertyValue));
            }
        }
        return vacuumCleaner;
    }

    public String getTableName() {
        return TABLE_NAME;
    }

}