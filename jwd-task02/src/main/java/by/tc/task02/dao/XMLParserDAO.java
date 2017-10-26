package by.tc.task02.dao;

import by.tc.task02.exception.DAOLayerException;

public interface XMLParserDAO {

    String readFile(String filePath) throws DAOLayerException;
}
