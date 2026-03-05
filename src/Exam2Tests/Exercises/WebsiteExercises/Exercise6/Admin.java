package Exam2Tests.Exercises.WebsiteExercises.Exercise6;

public class Admin extends User {
    public Admin(String username, String password)
    {
        super(username, password);
    }

    public void deletePost(Feed feed, Post p)
    {
        feed.removePost(p);
    }

    public void deleteVideoPost(Feed feed, VideoPost p)
    {
        feed.removeVideoPost(p);
    }

    public void deleteImagePost(Feed feed, ImagePost p)
    {
        feed.removeImagePost(p);
    }

    public void editCaption(Post p, String newCaption)
    {
        p.setCaption(newCaption);
    }
}
