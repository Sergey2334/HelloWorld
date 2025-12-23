package Lesson8.Exercise8;

public class Exercise8Main {
    public static void main(String[] args) {
        System.out.println("Hello, World :D");
    }

    public Client getClientWithCheapestList(Client[] client) // O(n^2)
    {
        int cheapestClientListIndex = 0;
        int cheapestClientListCost = 9999999; // temp Number
        for (int i = 0; i < client.length; i++)
        {
            Item[] currentClientList = client[i].getToBuy();
            int currentClientListCost = 0;
            for (int j = 0; j < currentClientList.length; j++)
            {
                currentClientListCost += (int) currentClientList[j].getCost();
            }

            if (currentClientListCost < cheapestClientListCost)
            {
                cheapestClientListCost = currentClientListCost;
                cheapestClientListIndex = i;
            }
        }
        return client[cheapestClientListIndex];
    }
}
