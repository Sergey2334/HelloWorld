package Lesson8.Exercise4;

public class Store {
    private Order[] ordersArray;
    private CityDelivery[] citiesDeliveryArray;

    // Store Class Builder
    public Store(Order[] ordersArray, CityDelivery[] citiesDeliveryArray)
    {
        this.ordersArray = ordersArray;
        this.citiesDeliveryArray = citiesDeliveryArray;
    }

    public String mostExpensiveCityDelivery() // O(n)
    {
        int mostExpensiveCityIndex = 0;
        int mostExpensivePrice = 0;
        for (int i = 0; i < this.citiesDeliveryArray.length; i++)
        {
            if (citiesDeliveryArray[i].getCityDistanceFromStore() > mostExpensivePrice)
            {
                mostExpensivePrice = citiesDeliveryArray[i].getCityDistanceFromStore();
                mostExpensiveCityIndex = i;
            }
        }
        return citiesDeliveryArray[mostExpensiveCityIndex].getCityName();
    }

    public String[] initialsOfClientsWithExpensiveDelivery(int price) // O(n)
    {
        String tempStringArray = "";
        for (int i = 0; i < this.ordersArray.length; i++)
        {
            if (ordersArray[i].getOrderPrice() >= price)
            {
                tempStringArray += ordersArray[i].getCustomerInitials() + " ";
            }
        }

        return tempStringArray.split(" ");
    }
}
