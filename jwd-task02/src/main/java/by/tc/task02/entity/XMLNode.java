package by.tc.task02.entity;

import java.util.List;

public interface XMLNode {

    String getTagName();

    Object getTagValue();

    List<XMLAttribute> getTagAttributes();
}
