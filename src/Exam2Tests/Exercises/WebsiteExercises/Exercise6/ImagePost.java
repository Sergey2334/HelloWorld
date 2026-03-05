package Exam2Tests.Exercises.WebsiteExercises.Exercise6;

public class ImagePost extends Post{
    private int imageCount;
    private String filterName;


    public ImagePost(String caption, String timeStamp, int imageCount, String filterName)
    {
        super(caption, timeStamp);
        this.imageCount = imageCount;
        this.filterName = filterName;
    }

    public boolean isHighlight()
    {
        boolean result = false;

        if ((this.imageCount >= 3 && this.imageCount <= 10) && this.filterName != null)
        {
            result = true;
        }

        return result;
    }
}
