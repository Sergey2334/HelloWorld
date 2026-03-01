package Exam2Tests.Exercises.WebsiteExercises.Exercise1;

public class Exercise1Main {
    public static void main(String[] args) {
        PointV2 myPoint1 = new PointV2(0, 0);
        PointV2 myPoint2 = new PointV2(4, 3);

        myPoint1.print();
        myPoint2.print();

        System.out.println(myPoint1);
        System.out.println(myPoint2);
        System.out.println(myPoint1.isOrigin());
        System.out.println(myPoint2.isOrigin());
        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint2.distance(myPoint1));
    }
}
