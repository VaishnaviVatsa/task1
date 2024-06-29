/*
Vaishnavi Vatsa
Task3
*/

import java.util.*;
class UserAccount
{
    float Balance=10000;
    int PIN=1888;
}

class AtM extends UserAccount
{
    int choice;
    //user input
    Scanner sc=new Scanner(System.in);
    void show()
    {
        System.out.println("\n         * * * WELCOME TO ATM * * *");
    }

    public void CheckPin()
    {
        System.out.println("\nEnter your PIN : ");
        int userpin=sc.nextInt();
        if(userpin==PIN)
        {
            Menu();
        }
        else
        {
            System.out.println("PIN MISMATCHED!!!PLEASE ENTER VALID PIN : ");
            CheckPin();
        }
    }

    void AccountBalance()
    {
        System.out.println("Your Account Balance is : "+Balance);
    }

    void WithDrawal()
    {
        System.out.println("Enter amount for withdrawal : ");
        float W_Amount = sc.nextFloat();
        if(W_Amount<=Balance)
        {
            System.out.println("Money Withdrawal Successfully!!!!!");
            Balance=Balance - W_Amount;
            System.out.println("Remaining Balance : "+Balance);
        }
        else
        {
            System.out.println("Insufficient Balance....");
        }
    }

    void Deposit()
    {
        System.out.println("Enter  Deposite Amount : ");
        float D_Amount =sc.nextFloat();
        System.out.println("Amount Deposited Successfully");
        Balance = Balance + D_Amount;
        System.out.println("Total Amount : "+Balance);
    }

    void Menu()
    {
        System.out.println("* * * * MENU * * * *");
        System.out.println("1. Check Account Balance");
        System.out.println("2. WithDraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("-------------------------");
        System.out.println("Enter your choice : ");
        choice =sc.nextInt();
        switch (choice)
        {
            case 1:{
                    AccountBalance();
                    System.out.println("------------------");
                    Menu();
                    break;
                   }

                case 2:{
                       WithDrawal();
                       System.out.println("------------------");
                       Menu();
                       break;
                    }

                case 3:{
                        Deposit();
                        System.out.println("------------------");
                        Menu();
                        break;
                        }

                case 4: {
                    System.out.println(" * * * THANK YOU FOR VISIT  * * *");
                    break;
                    }
        }
    }
}


public class task3 {
    public static void main(String args[])
    {
        AtM a = new AtM();
        a.show();
        a.CheckPin();
    }
}