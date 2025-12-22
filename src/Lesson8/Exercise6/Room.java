package Lesson8.Exercise6;

public class Room {
    /*
    Rooms can be From 100 to 2099
    Room 100    1       00
                Floor   00 Rooms From Elevator

    Room 1404   14      04
                Floor   04 Rooms From Elevator

    Room 2099   20      99
                Floor   99 Rooms From Elevator

    Elevator - Rooms XX00 to XX05 , Close to Elevator

    Type -  1. Normal
            2. Upgraded
            3. Suite

    Price:
        Base - 2000

        Floor - 11 to 20:
            +((XX - 10) * 100)
        Elevator - 00 to 05
            +200

        totalPrice

        Type -
            1. Upgraded = totalPrice * 1.5
            2. Suite    = totalPrice * 2.5
    */
    private int roomNumber;
    private int roomType;
    private boolean isAvailable;

    public Room(int roomNumber, int roomType) // O(1)
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public String toString() // O(1)
    {
        return roomNumber + " (" + roomType + ")";
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public int getRoomType()
    {
        return roomType;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public int floor() // O(1)
    {
        //(A)BCD / 100 => (A)B , If there is A
        return roomNumber / 100;
    }

    private int getRoomsFromElevator() // O(1)
    {
        // (A)BCD % 100 => CD , If there is A
        return  roomNumber % 100;
    }

    public int calculatePrice() // O(1)
    {
        final int BASE_PRICE = 2000;
        int totalPrice = BASE_PRICE;

        //System.out.println("Current price is " + totalPrice);

        //Floor Price Increase
        final int MAX_FLOOR_TO_BASE_PRICE = 10;
        final int PRICE_PER_FLOOR_INCREASE = 100;
        int floor = this.floor();
        if (floor > MAX_FLOOR_TO_BASE_PRICE)
        {
            totalPrice += ((floor - MAX_FLOOR_TO_BASE_PRICE) * PRICE_PER_FLOOR_INCREASE);
        }

        //System.out.println("Current price is " + totalPrice);

        // Elevator Price Increase
        final int MAX_ROOM_CLOSE_TO_ELEVATOR = 5;
        final int CLOSE_TO_ELEVATOR_PRICE_INCREASE = 200;
        int roomsFromElevator = this.getRoomsFromElevator();
        if (roomsFromElevator <= MAX_ROOM_CLOSE_TO_ELEVATOR)
        {
            totalPrice += CLOSE_TO_ELEVATOR_PRICE_INCREASE;
        }

        //System.out.println("Current price is " + totalPrice);

        // Type Price Increase
        final int TYPE_NORMAL = 1;
        final int TYPE_UPGRADED = 2;
        final float TYPE_UPGRADED_PRICE_INCREASE = 1.5f;
        final int TYPE_SUITE = 3;
        final float TYPE_SUITE_PRICE_INCREASE = 2.5f;
        if (this.roomType > TYPE_NORMAL)
        {
            if (this.roomType == TYPE_UPGRADED)
            {
                totalPrice *= (int) TYPE_UPGRADED_PRICE_INCREASE;
            }
            else if (this.roomType == TYPE_SUITE)
            {
                totalPrice *= (int) TYPE_SUITE_PRICE_INCREASE;
            }
        }

        //System.out.println("Current price is " + totalPrice);

        return totalPrice;
    }


}
