package Lesson8.Exercise5;

public class Exercise5Main {
    public static void main(String[] args) {
        User user1Test = new User("John", "Doe");
        User user2Test = new User("Bob", "SquarePants");

        User[] userTestArray1Following = {user1Test, user2Test};
        User[] userTestArray2Followers = {user1Test, user2Test};
        User[] userTestArray3Following = {};
        User[] userTestArray4Followers = {};

        User user3Test = new User("Test", "Testson", 33, userTestArray1Following, userTestArray2Followers);

        User user1 = new User("John", "Doe", 33, userTestArray1Following, userTestArray2Followers);
        User user2 = new User("Robert", "SquarePants", 33, userTestArray3Following, userTestArray4Followers);

        System.out.printf("user 1: follwers: %d , follwing: %d\n", user1.getFollowers().length, user1.getFollowing().length);
        System.out.printf("user 2: follwers: %d , follwing: %d\n", user2.getFollowers().length, user2.getFollowing().length);

        System.out.println(user1);
        System.out.println(user2);

        user1.removeFakeUsers();
        user2.removeFakeUsers();

        System.out.printf("user 1: follwers: %d , follwing: %d\n", user1.getFollowers().length, user1.getFollowing().length);
        System.out.printf("user 2: follwers: %d , follwing: %d\n", user2.getFollowers().length, user2.getFollowing().length);
    }
}
