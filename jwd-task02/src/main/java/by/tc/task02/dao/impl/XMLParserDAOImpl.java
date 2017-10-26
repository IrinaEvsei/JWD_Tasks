package by.tc.task02.dao.impl;

import by.tc.task02.dao.XMLParserDAO;
import by.tc.task02.exception.DAOLayerException;

import java.util.*;

public class XMLParserDAOImpl implements XMLParserDAO {

    public String readFile(String filePath) throws DAOLayerException {
        StringBuilder builder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(getClass().getResourceAsStream(filePath));
            while (scanner.hasNextLine()) {
                String fileRow = scanner.nextLine();
                if (!isEmpty(fileRow)) {
                    builder.append(fileRow.trim());
                }
            }
            scanner.close();
        } catch (Exception ex) {
            throw new DAOLayerException("File has not been read.", ex);
        }
        return builder.toString();
    }

    private static boolean isEmpty(String value) {
        return (value == null) || value.length() == 0;
    }
}
