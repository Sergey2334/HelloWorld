package Lesson7;

public class Exercise1 {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        System.out.println(getFullName(firstName, lastName));
    }

    public static String getFullName(String firstName, String lastName)
    {
        return firstName + " " + lastName;
    }
}
