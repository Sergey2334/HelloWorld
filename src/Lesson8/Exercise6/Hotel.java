package Lesson8.Exercise6;

public class Hotel {
    private String hotelName;
    private Room[] rooms;

    public Hotel(String hotelName, Room[] rooms) // O(1)
    {
        this.hotelName = hotelName;
        this.rooms = rooms;
    }

    public String toString()
    {
        return hotelName;
    }

    public String getHotelName()
    {
        return hotelName;
    }

    public Room[] getAvailableAndAffordableRooms(int type, int budget) // O(n) or O(2n) , I think its the same ?
    {
        // Gets Rooms Count
        int availableRoomsCount = 0;
        for (int i = 0; i < rooms.length; i++)
        {
            if (rooms[i].isAvailable() && rooms[i].getRoomType() == type && rooms[i].calculatePrice() <= budget)
            {
                availableRoomsCount++;
            }
        }

        // Create availableRoomsArray
        Room[] availableRoomsArray = new Room[availableRoomsCount];
        for (int i = 0, availableRoomsIndex = 0; i < rooms.length; i++)
        {
            if (rooms[i].isAvailable() && rooms[i].getRoomType() == type && rooms[i].calculatePrice() <= budget)
            {
                availableRoomsArray[availableRoomsIndex] = rooms[i];
            }
        }

        return availableRoomsArray;
    }

    public int income() // O(n)
    {
        int totalIncome = 0;
        for (int i = 0; i < rooms.length; i++)
        {
            if (!rooms[i].isAvailable())
            {
                totalIncome += rooms[i].calculatePrice();
            }
        }
        return totalIncome;
    }
}
