package Lesson8.Exercise2;

public class Car {
    private String company;
    private int year;
    private int speed;

    public void printStatus() // O(1)
    {
        System.out.println("Car Status:");
        System.out.println("-----------");
        System.out.printf("Company: %s, Year: %d, Speed: %d\n", company, year, speed);
    }

    public void accelerate() // O(1)
    {
        this.speed += 10;
    }

    public void brake() // O(1)
    {
        if (this.speed > 0)
        {
            this.speed -= 10;
        }
        else
        {
            this.speed = 0;
        }
    }
}
