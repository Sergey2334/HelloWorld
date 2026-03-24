package Exam2Tests.Exercises.WebsiteExercises.Exercise7;

public abstract class VideoContent {
    private String title;
    private String genre;
    private int[] ratings;
    private int minViewerAge;

    public VideoContent(String title, String genre, int minViewerAge)
    {
        this.title = title;
        this.genre = genre;
        this.minViewerAge = minViewerAge;

        this.ratings = new int[]{};
    }

    final private int AGE_FOR_KIDS = 3;

    public boolean isForKids()
    {
        return minViewerAge <= AGE_FOR_KIDS;
    }

    public String  getTitle()
    {
        return this.title;
    }

    private final int MIN_RATING = 1;
    private final int MAX_RATING = 5;
    public void addRating(int rating)
    {
        if (rating >= MIN_RATING && rating <= MAX_RATING)
        {
            int[] resultRatings = new int[ratings.length + 1];

            for (int i = 0; i < ratings.length; i++)
            {
                resultRatings[i] = ratings[i];
            }

            resultRatings[ratings.length] = rating;

            this.ratings = resultRatings;
        }
    }

    public double calculateAverageRating()
    {
        int sum = 0;

        for (int i = 0; i < ratings.length; i++)
        {
            sum += ratings[i];
        }

        return (double) sum / ratings.length;
    }
}