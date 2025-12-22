package Lesson8.Exercise4;

public class Order {
    private int[] pricesArray;
    private String deliveryAddress;
    private String customerName;
    private String orderPurchaseDate;
    private String orderRequestedDate;
    private int totalOrderPrice;

    // Order Class Builder
    public Order(String customerName, String deliveryAddress, int totalOrderPrice)
    {
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.totalOrderPrice = totalOrderPrice;
    }

    public String getCityName()  // O(1)
    {
        return this.deliveryAddress.substring(this.deliveryAddress.indexOf(",") + 1);
    }

    public String getCustomerInitials() // O(1)
    {
        String[] firstAndLastName = this.customerName.split(" ");
        return firstAndLastName[0].charAt(0) + "" + firstAndLastName[1].charAt(0);
    }

    public int getOrderPrice()  // O(1)
    {
        return this.totalOrderPrice;
    }
}
