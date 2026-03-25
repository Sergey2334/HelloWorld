package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

public interface Transactional {
    void deposit(int sum);
    boolean withdraw(int sum);
}