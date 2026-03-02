package Exam2Tests.Exercises.WebsiteExercises.Exercise4;

public class Bucket {
    private double capacity;
    private double current;


    public Bucket(double capacity)
    {
        this.capacity = capacity;
        this.current = 0.0;
    }

    public double getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public double getCurrent()
    {
        return current;
    }

    public String toString()
    {
        return "The Current State Of The Bucket: " + this.current + " Of " +  this.capacity + " Liters";
    }

    public boolean isEmpty()
    {
        return this.current == 0.0;
    }

    public boolean isFull()
    {
        return this.current == this.capacity;
    }

    public float percent()
    {
        return (float) ((this.current * 100) / this.capacity);
    }

    public boolean addLiter()
    {
        boolean result = false;

        if (!this.isFull())
        {
            result = true;

            this.current++;
        }

        return result;
    }

    public int addLiters(int amount)
    {
        double amountLeft = 0;

        double newCurrent = this.current + amount;

        if (newCurrent > this.capacity)
        {
            this.current = this.capacity;
            amountLeft = newCurrent - this.capacity;
        }

        else
        {
            this.current = newCurrent;
        }

        return (int) amountLeft;
    }

    public boolean spill()
    {
        boolean result = false;

        if (this.current != 0)
        {
            result = true;

            this.current = 0;
        }

        return result;
    }

    public boolean spill(int amount)
    {
        boolean result = false;

        if (amount <= this.current)
        {
            result = true;

            this.current -= amount;
        }

        return result;
    }

    public void fill()
    {
        this.current = this.capacity;
    }

    public void fill(Bucket other)
    {
        double otherBucketLitersLeft = (double) this.addLiters((int) other.getCurrent());
        other.spill((int) (other.getCurrent() - otherBucketLitersLeft));
    }
}
