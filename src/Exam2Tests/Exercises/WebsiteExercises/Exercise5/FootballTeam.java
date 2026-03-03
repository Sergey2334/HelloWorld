package Exam2Tests.Exercises.WebsiteExercises.Exercise5;

import java.util.Arrays;

public class FootballTeam {
    private String teamName;
    private Footballer[] footballers;


    public FootballTeam(String teamName, Footballer[] footballers)
    {
        this.teamName = teamName;
        this.footballers = footballers;
    }

    public String toString()
    {
        return teamName + "/n" + Arrays.toString(footballers);
    }

    public void addFootballer(Footballer footballerToAdd)
    {
        Footballer[] newFootballers = new Footballer[this.footballers.length + 1];

        for (int i = 0; i < this.footballers.length; i++)
        {
            newFootballers[i] = this.footballers[i];
        }

        newFootballers[this.footballers.length] = footballerToAdd;

        this.footballers = newFootballers;
    }

    public Footballer getFootballerByShirtNumber(int shirtNumber)
    {
        Footballer footballerToReturn = null;

        for (int i = 0; i < this.footballers.length; i++)
        {
            if (this.footballers[i].isShirtNumberCorrect(shirtNumber))
            {
                footballerToReturn = this.footballers[i];
            }
        }

        return footballerToReturn;
    }

    public String getTeamName()
    {
        return this.teamName;
    }
}
