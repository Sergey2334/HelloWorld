package Exam2Tests.Exercises.WebsiteExercises.Exercise1;

public class PointV2 {
    private double x;
    private double y;

    public PointV2(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return  String.format("(%.2f, %.2f)", x, y);
    }

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

    public double distance(PointV2 other)
    {
        double dx = other.getX() - this.x;
        double dy = other.getY() - this.y;

        return Math.sqrt((dx * dx) + (dy * dy));
    }
}
