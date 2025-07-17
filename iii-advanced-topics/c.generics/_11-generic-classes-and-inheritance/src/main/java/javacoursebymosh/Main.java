package javacoursebymosh;

/**
 * Demonstrates the concept of invariance in Java generics.
 */
public class Main {

    /**
     * The main entry point for the application.
     *
     * <h2>Generics and Invariance</h2>
     * A key rule in Java is that generic types are <b>invariant</b>. This means that
     * even if a class {@code Instructor} is a subtype of {@code User}, a collection
     * like {@code GenericList<Instructor>} is <b>not</b> considered a subtype of
     * {@code GenericList<User>}.
     *
     * <pre>{@code
     * GenericList<Instructor> instructors = new GenericList<>(Instructor.class, 10);
     * GenericList<User> users = instructors; // ❌ Compile-time error!
     * }</pre>
     *
     * <p>This rule exists to enforce <b>type safety</b>. If the assignment were allowed,
     * it would become possible to add a plain {@code User} object to a list that should
     * only contain {@code Instructor} objects, breaking the type contract of the list.
     *
     * <p><b>Why is this important?</b><br>
     * Let's imagine the compiler <i>did</i> allow this:
     *
     * <pre>{@code
     * GenericList<Instructor> instructors = new GenericList<>(Instructor.class, 10);
     * GenericList<User> users = instructors; // Imagine this compiles
     * users.add(new User(123));              // 😱 You just added a plain User!
     * }</pre>
     *
     * <p>Now the {@code instructors} list contains a {@code User}, not just {@code Instructor}
     * objects. That breaks the assumption that the list is only for instructors and could cause
     * runtime errors elsewhere in the program.
     *
     * <p>By enforcing <b>invariance</b>, the compiler prevents this and ensures type safety.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a list that can hold User objects or their subclasses.
        var users = new GenericList<>(User.class, 10);
    }
}
