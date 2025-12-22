package Lesson8.Exercise1;

public class Exercise1Main {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.printDetails();
        System.out.println(myStudent.isExcellent());
        myStudent.birthday();
        myStudent.printDetails();
    }
}
