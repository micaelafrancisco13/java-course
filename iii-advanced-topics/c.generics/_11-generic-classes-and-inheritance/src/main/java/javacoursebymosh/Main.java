package javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(10);
        User user2 = new Instructor(20);

        var users = new GenericList<>(User.class, 10);

        // what if we expected a list of Instructors to print?
        var instructors = new GenericList<>(Instructor.class, 10);
        // users = instructors;

        // Line 13 throws compilation error.
        // Why? Because GenericList<Instructor> is not a subtype of
        // GenericList<User>, even if Instructor extends User.

        // Why? Because allowing that would break type safety.
        // Imagine if this were allowed:
        // GenericList<User> users2 = new GenericList<Instructor>(Instructor.class, 10);
        users.add(new User(13)); // Adding a User to a list of Instructors!
        // This would violate the list’s internal type constraint (it's supposed
        // to only hold Instructor objects), which breaks the type safety Java
        // promises with generics.
    }
}