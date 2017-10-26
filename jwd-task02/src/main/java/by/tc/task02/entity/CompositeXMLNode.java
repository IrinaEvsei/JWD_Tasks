package by.tc.task02.entity;

import java.util.ArrayList;
import java.util.List;

public class CompositeXMLNode extends SimpleXMLNode {

    private List<XMLNode> childNodes = new ArrayList<XMLNode>();

    public CompositeXMLNode(String name) {
        super(name);
    }

    public List<XMLNode> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<XMLNode> childNodes) {
        this.childNodes = childNodes;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(getTagName());
        if (!getTagAttributes().isEmpty()) {
            builder.append("(");
            builder.append(getTagAttributes().toString());
            builder.append(")");
        }
        return builder.toString();
    }
}
