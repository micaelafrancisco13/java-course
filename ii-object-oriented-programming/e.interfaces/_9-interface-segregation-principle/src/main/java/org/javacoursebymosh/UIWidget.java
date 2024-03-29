package org.javacoursebymosh;

public interface UIWidget extends Draggable, Resizable {
    // we need the ff. capabilities in a UI widget
    // drag, resize, & render

    // if we change the signature of one of the 2 methods below,
    // the classes that are dependent on the UIWidget interface
    // have to be re-compiled, albeit they're not using the
    // method - the Dragger class only uses drag()
    void render();

    // what if we have an interface with 10 or 20 methods? this
    // is where "interface segregation principle" comes to the
    // rescue. it says that an interface should be focused on a
    // single capability

    // we should extract a new interface and move there the
    // methods that should be separated

    // what if we want an object with all the 3 capabilities?
    // an object that can be resized, rendered, and dragged
    // use INHERITANCE between interfaces
    // "extends Draggable" - this interface now has access to
    // the drag()

    // Unlike Java classes, a Java interface can have multiple
    // parents. If the parent interfaces declare the same
    // signatures, the base interface will only inherit one of
    // them, and it doesn't matter because they are only
    // declarations and have no implementations
}

