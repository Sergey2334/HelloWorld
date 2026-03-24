package Exam2Tests.Exercises.WebsiteExercises.Exercise7;

public class Exercise7Main {
    public static void main(String[] args) {
        Episode ep1 = new Episode("Hello, World !", 72);
        Episode ep2 = new Episode("GoodBye!", 27);

        Episode[] episodes = {ep1, ep2};

        for (int i = 0; i < episodes.length; i++)
        {
            System.out.println(episodes[i]);
            System.out.println(episodes[i].getShortName());
            System.out.println(episodes[i].isLong());
        }
    }
}
