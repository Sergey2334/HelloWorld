package Exam2Tests.Exercises.WebsiteExercises.Exercise6;

public class Exercise6Main {
    public static void main(String[] args) {
        Post myPost1 = new Post("Hello, World :D", "13:34:05 | 05.03.2026");
        Post myPost2 = new Post("GoodBye, World :D", "13:35:05 | 05.03.2026");

        System.out.println(myPost1);
        System.out.println(myPost2);

        Creator creator1 = new Creator("Creator1", "Creator 1");
        creator1.uploadPost(myPost1);
        System.out.println(creator1);

        Admin admin1 = new Admin("Admin1", "Admin 1");
        System.out.println(admin1);

        System.out.println(myPost1);
        admin1.editCaption(myPost1, "New Caption");
        System.out.println(myPost1);
        admin1.editCaption(myPost1, "Hello, World :D");
        System.out.println(myPost1);
    }
}
