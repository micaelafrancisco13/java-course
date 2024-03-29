package org.javacoursebymosh;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        System.out.println("TextBox class");
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public void clear() {
        text = "";
    }
}
