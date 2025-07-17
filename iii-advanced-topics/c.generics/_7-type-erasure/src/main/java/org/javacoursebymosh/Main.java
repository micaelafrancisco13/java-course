package org.javacoursebymosh;

/**
 * A class to introduce the concept of Java Bytecode.
 */
public class Main {

    /**
     * The main entry point for the application.
     *
     * <h2>Java Bytecode</h2>
     * When you compile Java code (e.g., using <i>"Build Project"</i> in IntelliJ), the
     * Java compiler does not produce native machine code directly. Instead, it
     * generates <b>bytecode</b>.
     *
     * <p>Bytecode is a platform-independent representation of your program. The Java
     * Virtual Machine (JVM) then takes this bytecode at runtime and translates it
     * into native code for the specific operating system and hardware it's running
     * on. This is the core mechanism behind Java's <i>"write once, run anywhere"</i>
     * principle. ☕
     */
    public static void main(String[] args) {
        var list = new GenericList<Short>();
    }
}
