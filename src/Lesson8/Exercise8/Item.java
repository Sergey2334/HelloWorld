package Lesson8.Exercise8;

public class Item {
    private String name;
    private double cost;
    private int count;

    public Item(String name, double cost, int count) // O(1)
    {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public String toString() // O(1)
    {
        return "Name: " + this.name + ", Cost: " + this.cost + ", Count: " + this.count;
    }

    public String getName() // O(1)
    {
        return this.name;
    }

    public double getCost() // O(1)
    {
        return this.cost;
    }

    public int getCount() // O(1)
    {
        return this.count;
    }

    public boolean existInInventory() // O(1)
    {
        return this.count > 0;
    }

    public int decrementCount(int amount) // O(1)
    {
        int itemRemain = this.count - amount;
        if (itemRemain < 0)
        {
            this.count = 0;
            return Math.abs(itemRemain);
        }
        this.count -= amount;
        return itemRemain;
    }

}
