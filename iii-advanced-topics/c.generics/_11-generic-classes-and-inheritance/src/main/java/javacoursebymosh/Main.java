package javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(10);
        User user2 = new Instructor(20);

        // go to Utils class
        Utils.printUser(user1);
        Utils.printUser(user2);

        // what if we expected a list of Users to print?
        var users = new GenericList<>();
        Utils.printUsers(users);

        // what if we expected a list of Instructors to print?
        var instructors = new GenericList<Instructor>();
        // line above throws compilation error because a generic
        // list of Instructor isn't a subtype of generic list of User.
        // reason? type T parameters are converted to Object class,
        // and the Object class isn't a subtype of itself

        // one way to pass a list of Instructors
//        var instructors = new GenericList<Instructor>();
        // we can iterate through the list of instructors and add each
        // instructor to the list of users. however, this is tedious
    }
}