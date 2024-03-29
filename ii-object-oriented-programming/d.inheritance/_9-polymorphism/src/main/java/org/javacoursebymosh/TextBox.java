package org.javacoursebymosh;

public class TextBox extends UIControl {
    private String text = "";

    // override the method from the base class
    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
