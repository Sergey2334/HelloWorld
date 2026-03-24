package Exam2Tests.Exercises.WebsiteExercises.Exercise7;

public class Movie extends VideoContent {
    private int movieLengthInMinutes;

    public Movie(String title, String genre, int minViewerAge, int  movieLengthInMinutes)
    {
        super(title, genre, minViewerAge);
        this.movieLengthInMinutes = movieLengthInMinutes;
    }

    private final int MIN_MOVIE_MINUTES = 80;
    private final int MAX_MOVIE_MINUTES = 210;
    public boolean isValidLength()
    {
        return this.movieLengthInMinutes >= MIN_MOVIE_MINUTES && this.movieLengthInMinutes <= MAX_MOVIE_MINUTES;
    }

    public boolean isForKids()
    {
        return super.isForKids();
    }

    public String toString()
    {
        String isForKidsStr = "";

        if (this.isForKids())
        {
            isForKidsStr = " (For Kids)";
        }

        return " \"" + super.getTitle() + "\", " + Helpers.convertMinLengthToStrFormat(movieLengthInMinutes) + isForKidsStr;
    }

    public void addScore(int score)
    {
        super.addRating(score);
    }

    public double calculateAverageScore()
    {
        double resultAverageScore = -1;

        if (this.isValidLength())
        {
            resultAverageScore = super.calculateAverageRating();
        }

        return resultAverageScore;
    }

    private final int IS_LONG_MIN_VAL = 151;
    private final int IS_LONG_MIN_VAL_FOR_KIDS = 101;
    public boolean isLong()
    {
        return this.movieLengthInMinutes >= IS_LONG_MIN_VAL_FOR_KIDS && this.isForKids() || this.movieLengthInMinutes >= IS_LONG_MIN_VAL;
    }
}