package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var browser = new Browser();
        // browser object now has 1 coupling point
        browser.navigate("192.158.1.38");
    }
}