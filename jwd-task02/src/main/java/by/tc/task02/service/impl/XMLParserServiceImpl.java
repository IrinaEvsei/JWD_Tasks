package by.tc.task02.service.impl;

import by.tc.task02.dao.DAOFactory;
import by.tc.task02.dao.XMLParserDAO;
import by.tc.task02.entity.CompositeXMLNode;
import by.tc.task02.entity.XMLNode;
import by.tc.task02.exception.DAOLayerException;
import by.tc.task02.exception.ServiceLayerException;
import by.tc.task02.utils.CharIterator;
import by.tc.task02.service.XMLParserService;

import static by.tc.task02.utils.XMLNodeBuilder.buildCompositeNode;
import static by.tc.task02.utils.XMLNodeBuilder.buildSimpleNode;
import static by.tc.task02.utils.XMLParserUtils.*;

public class XMLParserServiceImpl implements XMLParserService{

    private XMLParserDAO parserDAO = DAOFactory.getInstance().getXMLParserDAO();

    public XMLNode parseXML(String filePath) throws ServiceLayerException {
        try {
            String xmlAsString = parserDAO.readFile(filePath);

            xmlAsString = removeXMLInfo(xmlAsString);

            return parseXML(new CharIterator(xmlAsString));
        } catch (DAOLayerException ex) {
            throw new ServiceLayerException(ex.getMessage(), ex);
        }
    }

    private XMLNode parseXML(CharIterator charIterator) {
        XMLNode resultNode = null;
        String tagBody = null;
        String tagValue = null;
        while (charIterator.hasNext()) {
            if (isOpenTag(charIterator)) {
                if (isCloseTag(charIterator)) {
                    skipPositionsTillEndOfTag(charIterator);
                    if (resultNode == null) {
                        return buildSimpleNode(tagBody, tagValue);
                    } else {
                        return resultNode;
                    }
                } else {
                    if (tagBody == null) {
                        tagBody = getBodyFromTag(charIterator);
                        tagValue = getValueFromTag(charIterator);
                    } else {
                        XMLNode childNode = parseXML(charIterator);
                        if (resultNode == null) {
                            resultNode = buildCompositeNode(tagBody);
                        }
                        ((CompositeXMLNode) resultNode).getChildNodes().add(childNode);
                    }
                }
            }
        }
        return resultNode;
    }
}
