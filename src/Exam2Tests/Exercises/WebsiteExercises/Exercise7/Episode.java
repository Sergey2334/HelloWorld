package Exam2Tests.Exercises.WebsiteExercises.Exercise7;

public class Episode {
    private String episodeName;
    private int episodeLengthInMinutes;

    public Episode(String episodeName, int episodeLengthInMinutes)
    {
        this.episodeName = episodeName;
        this.episodeLengthInMinutes = episodeLengthInMinutes;
    }

    public String toString()
    {
        return "Episode Name: \"" + episodeName + "\", Length: " + Helpers.convertMinLengthToStrFormat(episodeLengthInMinutes);
    }

    private final int MIN_MINUTES_FOR_LONG_EPISODE = 31;
    public boolean isLong()
    {
        return this.episodeLengthInMinutes >= MIN_MINUTES_FOR_LONG_EPISODE;
    }

    public String getShortName()
    {
        String result = this.episodeName;

        if (this.episodeName.length() > 10)
        {
            result = this.episodeName.substring(0, 10) + "...";
        }

        return result;
    }

    public int getEpisodeLengthInMinutes()
    {
        return this.episodeLengthInMinutes;
    }
}