package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        // how to override a method declared in the base class?
        // for example, we want to override the toString()
        // go to the TextBox class
        textBox.setText("Hello world");
        System.out.println(textBox);

        // note that the "println" method automatically calls
        // toString() on any objects that we pass
    }
}