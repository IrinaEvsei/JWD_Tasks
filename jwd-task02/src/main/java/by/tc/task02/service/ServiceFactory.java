package by.tc.task02.service;

import by.tc.task02.service.impl.*;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final XMLParserService xmlParserService = new XMLParserServiceImpl();

	private ServiceFactory() {}

	public XMLParserService getXMLParserService() {
		return xmlParserService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
