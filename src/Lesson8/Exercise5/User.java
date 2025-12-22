package Lesson8.Exercise5;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int imageCount;
    private int videoCount;
    private User[] following;
    private User[] followers;

    // User Class Builder
    public User(String firstName, String lastName, int age, User[] following, User[] followers) // O(1)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.imageCount = 0;
        this.videoCount = 0;
        this.following = following;
        this.followers = followers;
    }

    // User Class Test Builder
    public User(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // User toString Override
    public String toString() // O(1)
    {
        return firstName + " " + lastName;
    }

    public int getImageCount()
    {
        return imageCount;
    }

    public int getVideoCount()
    {
        return videoCount;
    }

    public User[] getFollowing()
    {
        return following;
    }

    public User[] getFollowers()
    {
        return followers;
    }

    public boolean isValidName(String firstName, String lastName) // O(1) ?
    {
        if (firstName.matches(".*\\d.*")) // Checks if there is are Digits
        {
            return false;
        }
        if (lastName.matches(".*\\d.*")) // Checks if there is are Digits
        {
            return false;
        }
        return true;
    }

    public boolean isVIP () // O(1)
    {
        final int MIN_COUNT = 10;
        if (!isValidName(this.firstName, this.lastName))
        {
            return false;
        }
        else if ( this.imageCount < MIN_COUNT)
        {
            return false;
        }
        else if ( this.videoCount < MIN_COUNT)
        {
            return false;
        }
        else if (getValidFollowerCount() < MIN_COUNT)
        {
            return false;
        }
        return true;
    }

    private int getValidFollowerCount() // O(n)
    {
        int validFollowerCount = 0;
        for (int i = 0; i < this.followers.length; i++)
        {
            if (isValidName(followers[i].firstName, followers[i].lastName))
            {
                validFollowerCount++;
            }
        }
        return validFollowerCount;
    }

    public int countMutualConnections() // O(?)
    {
        // Function That Count Mutual Connections
        int mutualConnectionCount = 0; // Test
        return mutualConnectionCount;
    }

    public boolean isFakeAccount(User user) // O(1)
    {
        if (user.imageCount == 0 && user.videoCount == 0 && user.countMutualConnections() == 0)
        {
            return true;
        }
        return false;
    }

    public void removeFakeUsers() // O(n) ?
    {
        if (this.followers == null || this.following == null)
        {
            return;
        }

        for (int i = 0; i < this.following.length; i++)
        {
            if (isFakeAccount(this.following[i]))
            {
                this.following[i] = null;
            }
        }

        for (int i = 0; i < this.followers.length; i++)
        {
            if (isFakeAccount(this.followers[i]))
            {
                this.followers[i] = null;
            }
        }

        this.following = removeNullUsers(this.following);
        this.followers =removeNullUsers(this.followers);
    }

    private User[] removeNullUsers(User[] usersArray) // O(n)
    {
        int nullUserCount = 0;
        for (int i = 0; i < usersArray.length; i++)
        {
            if (usersArray[i] == null)
            {
                nullUserCount++;
            }
        }

        User[] newUserArray = new User[usersArray.length - nullUserCount];

        for (int i = 0, newUserArrayIndex = 0; i < newUserArray.length; i++)
        {
            if (usersArray[i] != null)
            {
                newUserArray[newUserArrayIndex] = usersArray[i];
                newUserArrayIndex++;
            }
        }

        return newUserArray;
    }
}