package javacoursebymosh;

/**
 * Demonstrates the three types of wildcards in Java generics.
 *
 * <p><b>Wildcards</b>, represented by the question mark {@code ?}, provide flexibility
 * when working with generic types. They allow you to define methods that can accept a
 * range of related generic types, rather than just a single one.</p>
 *
 * <p>This overcomes the limitations of <b>invariance</b>, where a {@code List<Integer>} is not
 * considered a subtype of {@code List<Number>}.</p>
 *
 * <p>There are three types of wildcards:</p>
 * <ol>
 *   <li><b>Unbounded Wildcard ({@code <?>}):</b> Represents any unknown type.
 *       Useful when the operations don't depend on the type itself.</li>
 *   <li><b>Upper Bounded Wildcard ({@code <? extends Type>}):</b> Restricts the
 *       unknown type to be a specific type or one of its subtypes. Ideal for
 *       reading from a data structure (a "producer").</li>
 *   <li><b>Lower Bounded Wildcard ({@code <? super Type>}):</b> Restricts the
 *       unknown type to be a specific type or one of its supertypes. Ideal for
 *       writing to a data structure (a "consumer").</li>
 * </ol>
 *
 * <p>This is often summarized by the mnemonic <b>PECS</b>: Producer Extends, Consumer Super.</p>
 */
public class Main {
    public static void main(String[] args) {
        UnboundedWildcard.demo();
        UpperBoundedWildcard.demo();
        LowerBoundedWildcard.demo();
    }
}
