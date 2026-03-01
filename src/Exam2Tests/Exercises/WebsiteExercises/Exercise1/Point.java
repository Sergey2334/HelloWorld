package Exam2Tests.Exercises.WebsiteExercises.Exercise1;

public class Point {
    private double x;
    private double y;

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public boolean isOrigin()
    {
        boolean result = false;

        if (this.x == 0 && this.y == 0)
        {
            result = true;
        }

        return result;
    }

    public void print()
    {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    public double distance(Point other)
    {
        double dx = other.getX() - this.x;
        double dy = other.getY() - this.y;

        return Math.sqrt((dx * dx) + (dy * dy));
    }
}
