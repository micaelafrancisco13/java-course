package org.javacoursebymosh;

public class Resizer implements Resizable {
    @Override
    public void resize(int size) {
        System.out.println("Resizing done! " + size);
    }
}
