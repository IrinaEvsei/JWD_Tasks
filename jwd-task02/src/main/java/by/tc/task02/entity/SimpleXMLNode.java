package by.tc.task02.entity;

import java.util.ArrayList;
import java.util.List;

public class SimpleXMLNode implements XMLNode {

    private String tagName;
    private Object tagValue;
    private List<XMLAttribute> tagAttributes = new ArrayList<XMLAttribute>();

    public SimpleXMLNode(String tagName) {
        this.tagName = tagName;
    }

    public SimpleXMLNode(String tagName, Object tagValue) {
        this(tagName);
        this.tagValue = tagValue;
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public Object getTagValue() {
        return tagValue;
    }

    public void setTagValue(Object tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public List<XMLAttribute> getTagAttributes() {
        return tagAttributes;
    }

    public void setTagAttributes(List<XMLAttribute> tagAttributes) {
        this.tagAttributes = tagAttributes;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(getTagName()).append(" -- ").append(getTagValue());
        if (!getTagAttributes().isEmpty()) {
            builder.append("(");
            builder.append(getTagAttributes().toString());
            builder.append(")");
        }
        return builder.toString();
    }
}
