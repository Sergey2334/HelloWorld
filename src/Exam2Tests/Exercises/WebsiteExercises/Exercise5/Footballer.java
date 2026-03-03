package Exam2Tests.Exercises.WebsiteExercises.Exercise5;

public class Footballer {
    private String fullName;
    private int shirtNumber;
    private String role;
    private int scoreCount;


    public Footballer(String fullName, int shirtNumber, String role, int scoreCount)
    {
        this.fullName = fullName;
        this.shirtNumber = shirtNumber;
        this.role = role;
        this.scoreCount = scoreCount;
    }

    public String toString()
    {
        return this.fullName + " (" + this.shirtNumber + ")";
    }

    public void scoreGoal()
    {
        this.scoreCount++;
    }

    public void setShirtNumber(int shirtNumber)
    {
        this.shirtNumber = shirtNumber;
    }

    public boolean isShirtNumberCorrect(int shirtNumber)
    {
        return shirtNumber == this.shirtNumber;
    }
}
