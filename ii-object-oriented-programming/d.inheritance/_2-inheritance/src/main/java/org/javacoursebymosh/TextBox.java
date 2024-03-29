package org.javacoursebymosh;

// to have this class inherit all the features that we
// implemented in our UIControl class, we use the "extends"
// keyword
public class TextBox extends UIControl {
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
