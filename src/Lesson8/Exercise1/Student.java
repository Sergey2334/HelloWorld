package Lesson8.Exercise1;

public class Student {
    private String name;
    private int age;
    private double average;

    public void printDetails() { // O(1)
        System.out.println("Student Details:");
        System.out.println("----------------");
        System.out.printf("Name : %s, Age : %d, Average : %.2f\n", name, age, average);
    }

    public boolean isExcellent() // O(1)
    {
        if (this.average >= 90)
        {
            return true;
        }
        return false;
    }

    public void birthday() // O(1)
    {
        this.age++;
    }
}
