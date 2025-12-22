package Lesson8.Exercise5;

public class Exercise5Main {
    public static void main(String[] args) {
        User user1Test = new User("John", "Doe");
        User user2Test = new User("Bob", "SquarePants");

        User[] userTestArray1 = {user1Test, user2Test};
        User[] userTestArray2 = {};

        User user3Test = new User("Test", "Testson", 33, userTestArray1, userTestArray1);

        User user1 = new User("John", "Doe", 33, userTestArray1, userTestArray1);
        User user2 = new User("Robert", "SquarePants", 33, userTestArray1, userTestArray1);

        System.out.println(user1.getFollowers().length);
        System.out.println(user2.getFollowers().length);

        System.out.println(user1);
        System.out.println(user2);
        user1.removeFakeUsers();

        System.out.println(user1.getFollowers().length);
        System.out.println(user2.getFollowers().length);
    }
}
