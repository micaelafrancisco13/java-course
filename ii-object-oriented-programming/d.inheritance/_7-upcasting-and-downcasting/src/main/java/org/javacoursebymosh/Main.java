package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl();
        var textBox = new TextBox();
        show(textBox);

        // upcasting is casting an object to one of its super
        // types
        // the ff. are true for "show(textBox)"
        // 1. textBox object gets automatically cast to UI
        // control
        // 2. the toString() of the textBox object is called at
        // run-time
        // 3. at compile-time, when we are accessing the control
        // object in the show(), we don't have access to any of
        // the members in our textBox object
        // 4. if we want to have access to its members, we need
        // to explicitly cast the control object to textBox
        // object (line 33)

        // down-casting is casting an object to one of its
        // subtypes (only works when the passed object is one of
        // the subclasses, not the base class
    }

    // toString() of UIControl returns the original string
    // implementation
    // toString() of TextBox returns the current text
    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello world");
        }
        System.out.println(control);
    }
}