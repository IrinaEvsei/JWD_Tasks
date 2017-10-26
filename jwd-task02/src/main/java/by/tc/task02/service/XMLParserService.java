package by.tc.task02.service;

import by.tc.task02.entity.XMLNode;
import by.tc.task02.exception.ServiceLayerException;

public interface XMLParserService {

    XMLNode parseXML(String filePath) throws ServiceLayerException;
}
