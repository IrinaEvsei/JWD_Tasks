package by.tc.task02.utils;

import by.tc.task02.entity.CompositeXMLNode;
import by.tc.task02.entity.SimpleXMLNode;
import by.tc.task02.entity.XMLNode;

import java.util.List;

public class PrintXMLNode {

	public static void print(XMLNode rootNode) {
		StringBuilder builder = new StringBuilder();

		extractNodeToString(builder, rootNode, 0);

		System.out.println(builder);
	}

	private static void extractNodeToString(StringBuilder sb, XMLNode node, int childLevel) {

		for(int i = 0; i < childLevel; i++) {
			sb.append("\t");
		}

		if (node instanceof CompositeXMLNode) {
			CompositeXMLNode compositeNode = (CompositeXMLNode) node;
			sb.append(compositeNode.toString()).append("\n");

			List<XMLNode> childNotes = compositeNode.getChildNodes();
			for (XMLNode childNote : childNotes) {
				extractNodeToString(sb, childNote, childLevel + 1);
			}

		} else if (node instanceof SimpleXMLNode) {
			sb.append(node.toString()).append("\n");
		}
	}

}