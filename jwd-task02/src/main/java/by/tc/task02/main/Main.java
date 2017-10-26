package by.tc.task02.main;

import by.tc.task02.entity.XMLNode;
import by.tc.task02.exception.DAOLayerException;

import by.tc.task02.exception.ServiceLayerException;
import by.tc.task02.service.ServiceFactory;
import by.tc.task02.service.XMLParserService;
import by.tc.task02.utils.PrintXMLNode;


public class Main {

	private static final String FILE_PATH = "/food.xml";

	public static void main(String[] args) throws DAOLayerException {

		ServiceFactory factory = ServiceFactory.getInstance();
		XMLParserService service = factory.getXMLParserService();

		try{
			XMLNode rootNode = service.parseXML(FILE_PATH);
			PrintXMLNode.print(rootNode);
		}catch (ServiceLayerException ex){
			System.out.println("Service was not able to read/parse XML");
			ex.printStackTrace();
		}

	}
}