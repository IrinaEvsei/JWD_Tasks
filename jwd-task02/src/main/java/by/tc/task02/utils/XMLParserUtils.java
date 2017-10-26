package by.tc.task02.utils;

public class XMLParserUtils {

    public static final String EMPTY_VALUE = "";
    public static final String DOUBLE_QUOTES = "\"";
    public static final String XML_TAG_ATTRIBUTE_SEPARATOR = " ";
    public static final String XML_TAG_ATTRIBUTE_KEY_VALUE_SEPARATOR = "=";
    private static final String OPEN_BRACKET = "<";
    private static final String BACK_SLASH = "/";
    private static final String CLOSE_BRACKET = ">";
    private static final String XML_INFO_PATTERN = "(<\\?)(.*)(\\?>)";
    private static final String XML_COMMENTS_PATTERN = "(<!--)(.*)(-->)";

    public static boolean isOpenTag(CharIterator charIterator){
        String firstChar = charIterator.next();
        charIterator.decrementPosition();
        return OPEN_BRACKET.equals(firstChar);
    }

    public static boolean isCloseTag(CharIterator charIterator){
        String firstChar = charIterator.next();
        String nextChar = charIterator.next();
        charIterator.decrementPosition(2);

        return OPEN_BRACKET.equals(firstChar) && BACK_SLASH.equals(nextChar);
    }

    public static String getBodyFromTag(CharIterator charIterator) {
        StringBuilder result = new StringBuilder();
        while (charIterator.hasNext()) {
            String curChar = charIterator.next();
            if (CLOSE_BRACKET.equals(curChar)) {
                break;
            }
            if (OPEN_BRACKET.equals(curChar)) {
                continue;
            }
            result.append(curChar);
        }
        return result.toString();
    }

    public static String getValueFromTag(CharIterator charIterator) {
        StringBuilder result = new StringBuilder();
        while (charIterator.hasNext()) {
            String curChar = charIterator.next();
            if (OPEN_BRACKET.equals(curChar)) {
                charIterator.decrementPosition();
                break;
            }
            result.append(curChar);
        }

        return result.toString();
    }

    public static void skipPositionsTillEndOfTag(CharIterator charIterator) {
        while (charIterator.hasNext()) {
            String curChar = charIterator.next();
            if (CLOSE_BRACKET.equals(curChar)) {
                break;
            }
        }
    }

    public static String removeXMLInfo(String xmlAsString) {
        String result = xmlAsString;

        result = result.replaceAll(XML_INFO_PATTERN, EMPTY_VALUE);
        result = result.replaceAll(XML_COMMENTS_PATTERN, EMPTY_VALUE);

        return result;
    }
}