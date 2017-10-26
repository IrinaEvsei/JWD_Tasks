package by.tc.task02.utils;

import java.util.Iterator;

public class CharIterator implements Iterator<String> {

    private final String str;
    private int currentPosition = 0;

    public CharIterator(String str) {
        this.str = str;
    }

    public boolean hasNext() {
        return currentPosition < str.length();
    }

    public String next() {
        return str.substring(currentPosition, ++currentPosition);
    }

    public void decrementPosition() {
        decrementPosition(null);
    }

    public void decrementPosition(Integer value) {
        if (value != null) {
            currentPosition -= value;
        } else {
            currentPosition--;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
