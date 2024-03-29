package javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(10);
        User user2 = new Instructor(20);

        Utils.printUser(user1);
        Utils.printUser(user2);

        // what if we expected a list of Users to print?
        var users = new GenericList<>();
        Utils.printUsers(users);

        // what if we expected a list of Instructors to print?
        // use a wildcard on the printUsers() on the Utils class
        var instructors = new GenericList<Instructor>();
        // we can pass here a list of anything
//         Utils.printUsers(instructors);
    }
}