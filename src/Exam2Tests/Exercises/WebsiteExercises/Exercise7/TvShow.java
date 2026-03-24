package Exam2Tests.Exercises.WebsiteExercises.Exercise7;

public class TvShow extends VideoContent {
    private Episode[]  episodes;

    public TvShow(String title, String genre, int minViewerAge)
    {
        super(title, genre, minViewerAge);

        this.episodes = new Episode[]{};
    }

    public String toString()
    {
        return super.getTitle() + " (" + this.episodes.length + ")";
    }

    public void addEpisode(Episode episodeToAdd)
    {
        Episode[] resultEpisodeArray = new Episode[this.episodes.length + 1];

        for (int i = 0; i < this.episodes.length; i++)
        {
            resultEpisodeArray[i] = this.episodes[i];
        }

        resultEpisodeArray[this.episodes.length] = episodeToAdd;

        this.episodes = resultEpisodeArray;
    }

    public boolean isLong() // If More Than Half Of The Episodes Are Long
    {
        boolean result = false;
        int episodeCount = this.episodes.length;

        int longEpisodeCount = 0;
        for (int i = 0; i < episodeCount; i++)
        {
            if (this.episodes[i].isLong())
            {
                longEpisodeCount++;
            }
        }

        if (longEpisodeCount > (episodeCount / 2))
        {
            result = true;
        }

        return result;
    }

    public int calculateLength()
    {
        int totalLengthInMinutes = 0;

        for (int i = 0; i < this.episodes.length; i++)
        {
            totalLengthInMinutes += this.episodes[i].getEpisodeLengthInMinutes();
        }

        return totalLengthInMinutes;
    }

    public Episode getLongestEpisode()
    {
        Episode resultEpisode = null;

        int maxLength = 0;
        for (int i = 0; i < this.episodes.length; i++)
        {
            if (this.episodes[i].getEpisodeLengthInMinutes() > maxLength)
            {
                maxLength = this.episodes[i].getEpisodeLengthInMinutes();
                resultEpisode = this.episodes[i];
            }
        }

        return resultEpisode;
    }

    public boolean forKids()
    {
        return super.isForKids();
    }

    public void addScore(int score)
    {
        super.addRating(score);
    }

    public double calculateAverageScore()
    {
        return super.calculateAverageRating();
    }
}