package org.javacoursebymosh;

public abstract class UIControl {
    private boolean isEnabled = true;

    // by declaring a method as abstract, the subclasses will
    // be forced to implement this method
    public abstract void render();

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
