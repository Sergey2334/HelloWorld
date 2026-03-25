package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccountBusiness extends BankAccount implements Authorized {
    private static final int businessLimit = Integer.MAX_VALUE;
    private static final int businessMaxOverdraft = -1000000;

    private AuthorizedUser[]  authorizedUsers;

    public BankAccountBusiness(int balance)
    {
        super(balance, BankAccountBusiness.businessLimit, BankAccountBusiness.businessMaxOverdraft); // Non-Limited , 1000000 Overdraft
        authorizedUsers = new AuthorizedUser[]{};
    }

    @Override
    public void printAuthorizedUsers()
    {
        System.out.println(Arrays.toString(authorizedUsers));
    }

    @Override
    public void addAuthorized()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Full Name: ");
        String fullName = input.nextLine();
        System.out.print("Enter Your ID: ");
        String id = input.nextLine();

        AuthorizedUser authorizedUserToAdd = new AuthorizedUser(fullName, id);

        AuthorizedUser[] resultAuthorizedUsers = new AuthorizedUser[this.authorizedUsers.length + 1];

        for (int i = 0; i < this.authorizedUsers.length; i++)
        {
            resultAuthorizedUsers[i] = this.authorizedUsers[i];
        }

        resultAuthorizedUsers[this.authorizedUsers.length] = authorizedUserToAdd;
        this.authorizedUsers = resultAuthorizedUsers;
    }

    @Override
    public void removeAuthorized(String id)
    {
        if (this.authorizedUsers.length > 0)
        {
            AuthorizedUser[] resultAuthorizedUsers = this.authorizedUsers;

            boolean foundFlag = false;
            for (int i = 0, j = 0; i < this.authorizedUsers.length; i++, j++)
            {
                if (!foundFlag && this.authorizedUsers[i].isAuthorized(id))
                {
                    resultAuthorizedUsers = new AuthorizedUser[this.authorizedUsers.length - 1];
                    foundFlag = true;
                    j--;
                    continue;
                }
                resultAuthorizedUsers[j] = this.authorizedUsers[i];
            }

            if  (foundFlag)
            {
                this.authorizedUsers = resultAuthorizedUsers;
            }
        }
    }
}