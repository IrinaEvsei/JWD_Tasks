package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.*;

public class SpeakersDAOImpl extends ApplianceDAOImpl implements ApplianceDAO {

    private static final String TABLE_NAME = "Speakers";

    public Speakers generateAppliance(String applianceName, Map<String, String> appliances) {
        Speakers speakers = new Speakers(applianceName);
        for (Map.Entry<String, String> mapEntry : appliances.entrySet()) {
            String propertyName = mapEntry.getKey();
            String propertyValue = mapEntry.getValue();
            if (SearchCriteria.Speakers.POWER_CONSUMPTION.isProperty(propertyName)) {
                speakers.setPowerConsumption(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.isProperty(propertyName)) {
                speakers.setNumberOfSpeakers(Integer.parseInt(propertyValue));
            }
            if (SearchCriteria.Speakers.FREQUENCY_RANGE.isProperty(propertyName)) {
                speakers.setFrequencyRange(String.valueOf(propertyValue));
            }
            if (SearchCriteria.Speakers.CORD_LENGTH.isProperty(propertyName)) {
                speakers.setCordLength(Integer.parseInt(propertyValue));
            }
        }
        return speakers;
    }

    public String getTableName() {
        return TABLE_NAME;
    }

}
