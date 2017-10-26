package by.tc.task02.dao;

import by.tc.task02.dao.impl.*;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final XMLParserDAO xmlParserDAO = new XMLParserDAOImpl();

	private DAOFactory() {}

	public XMLParserDAO getXMLParserDAO() {
		return xmlParserDAO;
	}

	public static DAOFactory getInstance() {return instance; }

}
