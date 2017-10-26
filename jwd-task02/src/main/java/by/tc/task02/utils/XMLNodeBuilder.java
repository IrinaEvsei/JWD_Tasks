package by.tc.task02.utils;

import by.tc.task02.entity.CompositeXMLNode;
import by.tc.task02.entity.SimpleXMLNode;
import by.tc.task02.entity.XMLAttribute;
import by.tc.task02.entity.XMLNode;

import static by.tc.task02.utils.XMLParserUtils.*;

public class XMLNodeBuilder {

    public static XMLNode buildSimpleNode(String tagBody, Object tagValue) {
        String[] tagAttributes = tagBody.split(XML_TAG_ATTRIBUTE_SEPARATOR);
        String tagName = tagAttributes[0];
        XMLNode simpleNode = new SimpleXMLNode(tagName, tagValue);
        return fillNodeByAttributes(simpleNode, tagAttributes);
    }

    public static XMLNode buildCompositeNode(String tagBody) {
        String[] tagAttributes = tagBody.split(XML_TAG_ATTRIBUTE_SEPARATOR);
        String tagName = tagAttributes[0];
        XMLNode compositeNode = new CompositeXMLNode(tagName);
        return fillNodeByAttributes(compositeNode, tagAttributes);
    }

    private static XMLNode fillNodeByAttributes(XMLNode node, String[] tagAttributes) {
        for (int i = 1; i < tagAttributes.length; i++) {
            node.getTagAttributes().add(buildNodeAttribute(tagAttributes[i]));
        }
        return node;
    }


    private static XMLAttribute buildNodeAttribute(String attributes) {
        String[] nodeAttributes = attributes.split(XML_TAG_ATTRIBUTE_KEY_VALUE_SEPARATOR);
        XMLAttribute attribute = new XMLAttribute();
        attribute.setKey(nodeAttributes[0]);
        attribute.setValue(nodeAttributes[1].replaceAll(DOUBLE_QUOTES, EMPTY_VALUE));
        return attribute;
    }
}