package Lesson8.Exercise7;

public class Exercise7Main {
    public static void main(String[] args) {
        Car myCar1 = new Car(25 , 45, 0.1f);
        Car myCar2 = new Car(50 , 90, 0.4f);
        Car myCar3 = new Car(35 , 35, 0.1f);

        Car[] myCarsArray = {myCar1, myCar2, myCar3};

        float[] maxKmDriveForEachCar = getMaxKmDriveOfCar(myCarsArray);

        for (int i = 0; i <maxKmDriveForEachCar.length ; i++)
        {
            System.out.println(maxKmDriveForEachCar[i]);
        }
    }

    public static float[] getMaxKmDriveOfCar(Car[] myCarsArray) // O(n)
    {
        float[] maxKmDriveOfEachCar = new float[myCarsArray.length];

        // L/KM = X
        // L = X*KM
        // KM = L/X
        for (int i = 0; i < myCarsArray.length; i++)
        {
            maxKmDriveOfEachCar[i] = myCarsArray[i].getFuel() / myCarsArray[i].getLitersPerKm();
        }

        return maxKmDriveOfEachCar;
    }
}
