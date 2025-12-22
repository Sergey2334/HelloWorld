package Lesson8.Exercise4;

public class Exercise4Main {
    public static void main(String[] args) {
        Order order1 = new Order("John Doe", "Street 1 , Ashkelon" , 100);
        Order order2 = new Order("Bob Doe", "Street 2 , Ashdod" , 150);
        Order[] ordersArray = {order1, order2};

        CityDelivery city1 = new CityDelivery(order1.getCityName(), 10);
        CityDelivery city2 = new CityDelivery(order2.getCityName(), 30);
        CityDelivery[] citiesDeliveryArray = {city1, city2};

        Store myStore = new Store(ordersArray, citiesDeliveryArray);

        String[] clientsInitials = myStore.initialsOfClientsWithExpensiveDelivery(120);

        for (int i  = 0; i < clientsInitials.length; i++)
        {
            System.out.println(clientsInitials[i]);
        }
    }
}
