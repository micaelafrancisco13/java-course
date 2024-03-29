package org.javacoursebymosh;

public class UIControl {
    private boolean isEnabled = true;

    // generic method for rendering the subclasses
    // we can go to each subclass and override this method
    public void render() {

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
