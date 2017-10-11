package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.*;

public class TabletPCDAOImpl extends ApplianceDAOImpl implements ApplianceDAO {

    private static final String TABLE_NAME = "TabletPC";

    public TabletPC generateAppliance(String applianceName, Map<String, String> appliances) {
        TabletPC tabletPC = new TabletPC(applianceName);
        for (Map.Entry<String, String> mapEntry : appliances.entrySet()) {
            String propertyName = mapEntry.getKey();
            String propertyValue = mapEntry.getValue();
            if (SearchCriteria.TabletPC.BATTERY_CAPACITY.isProperty(propertyName)) {
                tabletPC.setBatteryCapacity(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.TabletPC.DISPLAY_INCHES.isProperty(propertyName)) {
                tabletPC.setDisplayInches(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.TabletPC.MEMORY_ROM.isProperty(propertyName)) {
                tabletPC.setMemoryROM(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.isProperty(propertyName)) {
                tabletPC.setFlashMemoryCapacity(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.TabletPC.COLOR.isProperty(propertyName)) {
                tabletPC.setColor(propertyValue);
            }
        }
        return tabletPC;
    }

    public String getTableName() {
        return TABLE_NAME;
    }

}