package Exam2Tests.Exercises.WebsiteExercises.Exercise6;

public class User {
    private String userName;
    private String displayName;


    public User(String userName, String displayName)
    {
        this.userName = userName;
        this.displayName = displayName;
    }

    public String toString()
    {
        return this.userName + " (" + this.displayName + ")";
    }

    public String  getUserName()
    {
        return this.userName;
    }
}
