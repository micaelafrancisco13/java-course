package org.javacoursebymosh;

public class UIControl {
    private boolean isEnabled = true;
    private String someArgument;

    public UIControl(String someArgument) {
        this.someArgument = someArgument;
        System.out.println("UIControl class");
        System.out.println("Passed from the child class " + someArgument);
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
