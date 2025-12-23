package Lesson8.Exercise8;

import java.security.spec.RSAOtherPrimeInfo;

public class Store {
    private Client[] clients;
    private Item[] items;

    public Item[] getItems() // O(1)
    {
        return items;
    }

    public void printPurchaseListForClient(Client client) // O(n)
    {
        int clientBudget = client.getBudget();
        String totalList = "";
        for (int i = 0; i < this.items.length; i++)
        {
            Item currentItem = this.items[i];
            if (currentItem != null && currentItem.existInInventory())
            {
                if (currentItem.getCost() < clientBudget)
                {
                    int currentItemAmount = currentItem.getCount() / clientBudget; // Should be at least 1
                    int tempClientBudget = clientBudget - (int) (currentItemAmount * currentItem.getCost());
                    if  (tempClientBudget < 0)
                    {
                        continue;
                    }
                    clientBudget -= (int) (currentItemAmount * currentItem.getCost());
                    totalList += currentItem.getName() + " " + currentItemAmount + " " + currentItem.getCost() * currentItemAmount + "\n";
                    if (currentItem.getCount() % clientBudget == 0)
                    {
                        break;
                    }
                }
            }
        }

        if (clientBudget > 0)
        {
            System.out.printf("Sorry %s Couldn't Find A Perfect List For Your Budget :'(\n", client.getName());
            return;
        }

        System.out.printf("Hello %s , Here Is A Perfect List For Your Budget\n", client.getName());
        System.out.println(totalList); // Not Removing Any Items From Inventory , Only Printing
    }


    /*
        Get Clients Budget
        Get Most Expensive Item, Check if In Budget
        If not Most Expensive Item After That, Check if In Budget
        Remove How many of that Item can that Budget get , Until reaches Zero or Before Zero
        Move to The Next Item..
        Each Item Save as a String Like So: {Item Name}{Item Amount}{Item Cost * Item Amount}{n\}
        Combine All Strings , Print totalListString

        We did , not Most Expensive but from the Start of The ItemsArray
        We Could Sort The ItemsArray to Most Expensive First and Then Do It

        Hopefully it Works :)
    */
}
