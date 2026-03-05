package Exam2Tests.Exercises.WebsiteExercises.Exercise6;

public class Creator extends User{
    private Post[] posts;
    private VideoPost[]  videoPosts;
    private ImagePost[] imagePosts;
    private User[] followers;


    public Creator(String username, String displayName)
    {
        super(username, displayName);
        this.posts = new Post[]{};
        this.videoPosts = new VideoPost[]{};
        this.imagePosts = new ImagePost[]{};
        this.followers = new User[]{};
    }

    public String toString()
    {
        return super.getUserName() + ":\n" +
                "\tFollowers Count: " + followers.length + "\n" +
                "\tPosts Count: " + this.getPostsCount();
    }

    public void uploadPost(Post p)
    {
        Post[] tempPosts = new Post[this.posts.length + 1];

        for (int i = 0; i < this.posts.length; i++)
        {
            tempPosts[i] = this.posts[i];
        }

        tempPosts[this.posts.length] = p;

        this.posts = tempPosts;
    }

    public int getPostsCount()
    {
        return this.posts.length + this.videoPosts.length + this.imagePosts.length;
    }
}
