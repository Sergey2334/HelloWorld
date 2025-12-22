package Lesson8.Exercise7;

public class Car {
    private int fuel;
    private int fuelCapacity;
    private float litersPerKm;

    public Car(int fuel, int fuelCapacity, float litersPerKm) // O(1)
    {
        this.fuel = fuel;
        this.fuelCapacity = fuelCapacity;
        this.litersPerKm = litersPerKm;
    }

    public int getFuel() // O(1)
    {
        return fuel;
    }

    public int getFuelCapacity() // O(1)
    {
        return fuelCapacity;
    }

    public float getLitersPerKm() // O(1)
    {
        return litersPerKm;
    }

    public float percent() // O(1)
    {
        // 100% | 400
        //  XX% | 200
        //  XX% = 200 * (100 / 400)
        return fuel * ((float) 100 / fuelCapacity);
    }

    public boolean urgentGasStation() // O(1)
    {
        final int MIN_FUEL_PERCENTAGE = 10;
        final int MIN_FUEL_AMOUNT = 20;
        return (this.percent() < MIN_FUEL_PERCENTAGE) || (this.fuel < MIN_FUEL_AMOUNT);
    }

    public boolean drive(int km) // O(1)
    {
        int totalFuelConsumption = (int) this.litersPerKm * km;

        if (fuel - totalFuelConsumption < 0)
        {
            return false;
        }
        fuel -= totalFuelConsumption;
        return true;
    }

}
