package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();

        // the following is true for protected members:
        // 1. subclasses do not inherit private members

        // 2. protected members are public in package, in
        // this case, "package org.javacoursebymosh"

        // 3. outside a different package, protected
        // members are private

        // 4. protected members are accessible by subclasses
        // in different packages

        // default access modifier is when an access modifier
        // is not explicitly stated
        // members with default access modifier are public
        // anywhere in their package but private outside their
        // package
    }
}