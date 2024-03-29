package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // stored in the heap (objects)
        // stored in the stack (primitive & reference variables)

        // "new TextBox()" -> new TextBox object is stored in the
        // heap. let's say that the object's address is 100, then
        // Java runtime will execute "var textBox1", it will
        // allocate memory in the stack, and in this memory
        // location, it'll store the TextBox object's address in
        // the heap, which is 100
        var textBox1 = new TextBox();
        var textBox2 = textBox1;
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
    }
    // when we exit a method, Java runtime will remove all the
    // variables on the stack, leaving "new TextBox()" on the
    // heap without any references to it. if this happens, if an
    // object becomes unused for a certain period of time, Java's
    // garbage collector automatically removes that object on
    // the heap
}