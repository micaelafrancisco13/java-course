package org.javacoursebymosh;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        // explicitly call the base class then pass an argument
        super("someArgument");
        System.out.println("TextBox class");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
