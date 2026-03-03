package Exam2Tests.Exercises.WebsiteExercises.Exercise5;

public class FootballMatch {
    private FootballTeam homeTeam;
    private int homeTeamGoalCount;
    private FootballTeam awayTeam;
    private int awayTeamGoalCount;


    public FootballMatch(FootballTeam homeTeam, int homeTeamGoalCount, FootballTeam awayTeam, int awayTeamGoalCount)
    {
        this.homeTeam = homeTeam;
        this.homeTeamGoalCount = homeTeamGoalCount;
        this.awayTeam = awayTeam;
        this.awayTeamGoalCount = awayTeamGoalCount;
    }

    public String toString()
    {
        return this.homeTeam + " - " + this.awayTeam + " : " + this.homeTeamGoalCount + " - " + this.awayTeamGoalCount;
    }

    public void scoreGoal(boolean homeTeam)
    {
        if(homeTeam)
        {
            this.homeTeamGoalCount++;
        }

        else
        {
            this.awayTeamGoalCount++;
        }
    }

    public String getWinner()
    {
        String resultString = "Draw";

        if (this.homeTeamGoalCount > this.awayTeamGoalCount)
        {
            resultString = this.homeTeam.getTeamName();
        }

        else if (this.awayTeamGoalCount > this.homeTeamGoalCount)
        {
            resultString = this.awayTeam.getTeamName();
        }

        return resultString;
    }
}
