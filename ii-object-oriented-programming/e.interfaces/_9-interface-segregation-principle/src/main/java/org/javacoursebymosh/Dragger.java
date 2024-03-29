package org.javacoursebymosh;

// let's imagine we're using this class to drag an object on
// the screen
public class Dragger implements Draggable {
    // from UIWidget interface to Draggable interface.

    // by using this interface, we only have 1 coupling point,
    // the drag()
    @Override
    public void drag() {
        System.out.println("Dragging done!");
    }
}
