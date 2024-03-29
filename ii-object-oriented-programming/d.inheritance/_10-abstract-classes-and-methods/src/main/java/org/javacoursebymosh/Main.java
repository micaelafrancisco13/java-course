package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Abstract classes can't be instantiated
        // UI control is an abstract concept, its implementation
        // varies among its subclasses (go to UIControl class)
        UIControl[] controls = { new TextBox(), new CheckBox() };

        for (var control : controls) control.render();
    }
}