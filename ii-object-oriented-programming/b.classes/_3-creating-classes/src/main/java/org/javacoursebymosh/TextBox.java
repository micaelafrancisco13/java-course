package org.javacoursebymosh;

public class TextBox {
    // 3 members (field & methods)
    public String text;

    public void setText(String text) {
        // in this method, we want to set the value of the text
        // field based on what is passed here
        this.text = text;
    }

    public void clear() {
        // we don't really need to use the "this" keyword because
        // we don't have a parameter called "text"
        text = "";
    }
}
