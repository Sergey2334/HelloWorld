package Lesson8.Exercise4;

public class CityDelivery {
    private String cityName;
    private int cityDistanceFromStore;

    // CityDelivery Class Builder
    public CityDelivery(String cityName, int cityDistanceFromStore) { // O(1)
        this.cityName = cityName;
        this.cityDistanceFromStore = cityDistanceFromStore;
    }

    public int getCityDistanceFromStore() // O(1)
    {
        return this.cityDistanceFromStore;
    }

    public String getCityName() // O(1)
    {
        return this.cityName;
    }
}
