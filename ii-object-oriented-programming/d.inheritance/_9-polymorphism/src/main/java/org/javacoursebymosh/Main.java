package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // at compile-time, we've declared an array of UI
        // controls, but at run-time, we're inserting different
        // objects inside this array
        UIControl[] controls = {new TextBox(), new CheckBox()};

        // in each iteration, we simply call render() of each
        // object
        for (var control : controls) control.render();
    }
}