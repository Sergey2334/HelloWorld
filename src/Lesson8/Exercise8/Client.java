package Lesson8.Exercise8;

public class Client {
    private String name;
    private Item[] toBuy;
    private int budget;

    public Client(String name, int budget) // O(1)
    {
        this.name = name;
        this.budget = budget;
    }

    public String toString() // O(1)
    {
        return "Name: " + this.name + ", Budget: " + this.budget;
    }

    public String getName() // O(1)
    {
        return this.name;
    }

    public int getBudget() // O(1)
    {
        return this.budget;
    }

    public Item[]  getToBuy() // O(1)
    {
        return this.toBuy;
    }

    public boolean hasEnoughBudget() // O(n)
    {
        int totalCost = 0;
        for(int i = 0; i < this.toBuy.length; i++)
        {
            totalCost += (int) this.toBuy[i].getCost();
        }
        return this.budget >= totalCost;
    }
}
