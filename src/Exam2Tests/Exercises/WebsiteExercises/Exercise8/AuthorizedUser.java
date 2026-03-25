package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

public class AuthorizedUser {
    private String fullName;
    private String id;

    public AuthorizedUser(String fullName, String id)
    {
        this.fullName = fullName;
        this.id = id;
    }

    public String toString()
    {
        return this.fullName;
    }

    public boolean isAuthorized(String id)
    {
        return id.equals(this.id);
    }
}