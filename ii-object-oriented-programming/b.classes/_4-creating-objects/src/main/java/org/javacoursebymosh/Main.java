package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // instantiating a new instance of TextBox class
        var textBox1 = new TextBox();

        // dot operator is used to look at the members of this
        // class
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        // string is a reference type
        // by default, reference types, when uninitialized, have
        // null values

        // another instance of the TextBox class
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}