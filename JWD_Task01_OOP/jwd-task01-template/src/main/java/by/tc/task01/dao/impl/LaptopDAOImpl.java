package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class LaptopDAOImpl extends ApplianceDAOImpl implements ApplianceDAO {

    private static final String TABLE_NAME = "Laptop";

    public Laptop generateAppliance(String applianceName, Map<String, String> appliances) {
        Laptop laptop = new Laptop(applianceName);
        for (Map.Entry<String, String> mapEntry : appliances.entrySet()) {
            String propertyName = mapEntry.getKey();
            String propertyValue = mapEntry.getValue();
            if (SearchCriteria.Laptop.BATTERY_CAPACITY.isProperty(propertyName)) {
                laptop.setBatteryCapacity(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Laptop.OS.isProperty(propertyName)) {
                laptop.setOs(String.valueOf(propertyValue));
            }
            if (SearchCriteria.Laptop.MEMORY_ROM.isProperty(propertyName)) {
                laptop.setMemoryROM(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Laptop.SYSTEM_MEMORY.isProperty(propertyName)) {
                laptop.setSystemMemory(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Laptop.CPU.isProperty(propertyName)) {
                laptop.setCpu(Double.parseDouble(propertyValue));
            }
            if (SearchCriteria.Laptop.DISPLAY_INCHS.isProperty(propertyName)) {
                laptop.setDisplayInches(Integer.parseInt(propertyValue));
            }
        }
        return laptop;
    }

    public String getTableName() {
        return TABLE_NAME;
    }
}