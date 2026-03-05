package Exam2Tests.Exercises.WebsiteExercises.Exercise6;

public class Post {
    private String caption;
    private String timeStamp;
    private int likesCount;
    private int commentsCount;
    private static int postsCreatedCount = 0; // That Will Be Our ID For Each Post Created
    private int id;


    public Post(String caption, String timeStamp)
    {
        this.caption = caption;
        this.timeStamp = timeStamp;
        Post.postsCreatedCount++;
        this.id = Post.postsCreatedCount;
    }

    private static int getPostsCreatedCount()
    {
        return Post.postsCreatedCount;
    }

    public String toString()
    {
        return "ID: " + this.id + "\n" +
                "\"" + this.caption + "\"\n" +
                "\tLike Count:  " + this.likesCount + "\n" +
                "\tComment Count: " + this.commentsCount + "\n" +
                "\tPopularity Score: " + this.getPopularityScore();
    }

    public void like()
    {
        this.likesCount++;
    }

    public void addComment()
    {
        this.commentsCount++;
    }

    public int getPopularityScore()
    {
        return this.likesCount + (this.commentsCount * 2);
    }

    public void setCaption(String caption)
    {
        this.caption = caption;
    }
}
