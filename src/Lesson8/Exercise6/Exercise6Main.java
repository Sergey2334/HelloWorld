package Lesson8.Exercise6;

public class Exercise6Main {
    public static void main(String[] args) {
        Room myRoom1 = new Room(1404, 3);
        Room myRoom2 = new Room(1405, 1);
        Room myRoom3 = new Room(150, 2);

//        System.out.println(myRoom1);
//        System.out.println(myRoom1.floor());
//        System.out.println(myRoom1.calculatePrice());

        Room[] myRoomsArray1 = {myRoom1, myRoom2};
        Room[] myRoomsArray2 = {myRoom2, myRoom3};

        Hotel myHotel1 = new Hotel("Snooze & Snore", myRoomsArray1);
        Hotel myHotel2 = new Hotel("Snore & Snooze", myRoomsArray2);

        Room[] availableAndAffordableRooms = myHotel1.getAvailableAndAffordableRooms(1, 7000);
        for (int i = 0; i < availableAndAffordableRooms.length; i++)
        {
            System.out.println(availableAndAffordableRooms[i]);
        }

        Hotel[] myHotelArray = {myHotel1, myHotel2};

        System.out.println(mostProfitableHotel(myHotelArray));
    }

    public static String mostProfitableHotel(Hotel[] hotels) // O(n)
    {
        String mostProfitableHotel = "";
        int maxProfit = 0;

        for (int i = 0; i < hotels.length; i++)
        {
            //System.out.println(hotels[i].getHotelName() + " " + hotels[i].income());

            if (maxProfit < hotels[i].income())
            {
                maxProfit = hotels[i].income();
                mostProfitableHotel = hotels[i].getHotelName();
            }
        }

        return mostProfitableHotel;
    }
}
