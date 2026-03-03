package Exam2Tests.Exercises.WebsiteExercises.Exercise5;

public class FootballLeague {
    private String footballLeagueName;
    private FootballTeam[] footballTeams;
    private FootballMatch[] footballMatches;

    public  FootballLeague(String footballLeagueName, FootballTeam[] footballTeams, FootballMatch[] footballMatches)
    {
        this.footballLeagueName = footballLeagueName;
        this.footballTeams = footballTeams;
        this.footballMatches = footballMatches;
    }

    public String toString()
    {
        String footballLeagueTeamsString = "";

        for (int i = 0; i < this.footballTeams.length; i++)
        {
            footballLeagueTeamsString += this.footballTeams[i].getTeamName() + " ";
        }

        return this.footballLeagueName + "'/n" + footballLeagueTeamsString;
    }
}
