package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};

        for (var control : controls) control.render();

        // when we declare a class as final, we cannot extend it
        // anymore. we prevent other classes from extending that
        // class

        // final methods cannot be overridden
    }
}