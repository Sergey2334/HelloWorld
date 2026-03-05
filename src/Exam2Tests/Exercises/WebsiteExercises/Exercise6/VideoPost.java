package Exam2Tests.Exercises.WebsiteExercises.Exercise6;

public class VideoPost extends Post {
    private int videoLength;
    private int videoQuality;

    public VideoPost(String caption, String timeStamp, int videoLength, int videoQuality)
    {
        super(caption, timeStamp);
        this.videoLength = videoLength;

        if (videoQuality < 0)
        {
            this.videoQuality = 0;
        }

        else if (videoQuality > 5)
        {
            this.videoQuality = 5;
        }

        else
        {
            this.videoQuality = videoQuality;
        }
    }

    public boolean isReel()
    {
        boolean result = false;

        if (this.videoLength < 60 && this.videoQuality >= 4)
        {
            result = true;
        }

        return result;
    }
}
