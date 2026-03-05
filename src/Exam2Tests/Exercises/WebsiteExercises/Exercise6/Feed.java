package Exam2Tests.Exercises.WebsiteExercises.Exercise6;

import java.util.Random;

public class Feed {
    private Post[] posts;
    private VideoPost[] videoPosts;
    private ImagePost[] imagePosts;


    public Feed(Post[] posts, VideoPost[] videoPosts, ImagePost[] imagePosts)
    {
        this.posts = posts;
        this.videoPosts = videoPosts;
        this.imagePosts = imagePosts;
    }

    public Post getMainContent()
    {
        Random randomNumber = new Random();
        int maxScore = 0;

        Post[] allPosts = addPostsArray(addPostsArray(this.posts, this.videoPosts), this.imagePosts);
        Post resultPost = allPosts[randomNumber.nextInt(0, allPosts.length - 1)];

        for (int i = 0; i < allPosts.length; i++)
        {
            int currentPostScore = allPosts[i].getPopularityScore() + randomNumber.nextInt(1, 10);
            if (maxScore < currentPostScore)
            {
                maxScore = currentPostScore;
                resultPost = allPosts[i];
            }
        }

        return resultPost;
    }

    private Post[] addPostsArray(Post[] postAray1,  Post[] postAray2)
    {
        Post[] resultPosts = new Post[postAray1.length + postAray2.length];

        int resultPostIndex = 0;
        for (int i = 0; i < postAray1.length; i++, resultPostIndex++)
        {
            resultPosts[resultPostIndex] = postAray1[i];
        }

        for (int i  = 0; i < postAray2.length; i++, resultPostIndex++)
        {
            resultPosts[resultPostIndex] = postAray2[i];
        }

        return resultPosts;
    }

    public void removePost(Post p)
    {
        this.posts = removePost(this.posts, p);
    }

    public void removeVideoPost(Post p)
    {
        this.videoPosts = (VideoPost[]) removePost(this.videoPosts, p);
    }

    public void removeImagePost(Post p)
    {
        this.imagePosts = (ImagePost[]) removePost(this.imagePosts, p);
    }

    private Post[] removePost(Post[] posts, Post targetPost)
    {
        int resultLength = posts.length;
        if (targetPost != null)
        {
            resultLength--;
        }
        Post[] resultPosts = new Post[resultLength];

        for (int i = 0, j = 0; i < resultLength; i++, j++)
        {
            if (resultPosts[i].equals(targetPost))
            {
                i--;
                continue;
            }
            resultPosts[i] = posts[j];
        }

        return resultPosts;
    }
}
