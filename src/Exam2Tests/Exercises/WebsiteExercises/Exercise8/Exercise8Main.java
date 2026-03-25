package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

public class Exercise8Main {
    public static void main(String[] args) {
        BankAccountRegular bankAccountRegular = new BankAccountRegular(0);
        BankAccountLimited bankAccountLimited = new BankAccountLimited(0);
        BankAccountOverdraft bankAccountOverdraft = new BankAccountOverdraft(0);
        BankAccountBusiness bankAccountBusiness = new BankAccountBusiness(0);

        BankAccount[] bankAccounts = {bankAccountRegular, bankAccountLimited, bankAccountOverdraft, bankAccountBusiness};

        for (int i = 0; i < bankAccounts.length; i++)
        {
            bankAccounts[i].printBalance();
            bankAccounts[i].printLastTransaction();
            bankAccounts[i].deposit(50000);
            bankAccounts[i].withdraw(2500);
            bankAccounts[i].printLastTransaction();
            bankAccounts[i].printBalance();

            System.out.println();
        }

        bankAccountBusiness.printAuthorizedUsers();
        bankAccountBusiness.addAuthorized();
        bankAccountBusiness.addAuthorized();
        bankAccountBusiness.addAuthorized();
        bankAccountBusiness.printAuthorizedUsers();
        bankAccountBusiness.removeAuthorized("321");
        bankAccountBusiness.printAuthorizedUsers();
        bankAccountBusiness.removeAuthorized("123");
        bankAccountBusiness.printAuthorizedUsers();
    }
}