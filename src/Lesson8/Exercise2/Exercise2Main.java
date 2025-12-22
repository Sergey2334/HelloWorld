package Lesson8.Exercise2;

public class Exercise2Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.printStatus();
        myCar.accelerate();
        myCar.accelerate();
        myCar.printStatus();
        myCar.brake();
        myCar.printStatus();
    }
}
