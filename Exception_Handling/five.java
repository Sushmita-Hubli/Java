package Exception_Handling;

import java.util.Scanner;

public class five
{
    static void meth2(int balance) throws Exception
    {
        if (balance<10)
        {
            throw new Exception("Balance cannot be less than 10");
        }
        else {
            System.out.println("Balance is valid!!");
        }
    }
    static void meth1(int balance) throws Exception
    {
        meth2(balance);
        System.out.println("haha");  //this line will not be executed if there exists an exception in previous line
    }
    public static void main(String[] args) throws Exception {
        int balance;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter balance: ");
        balance=sc.nextInt();
        meth1(balance);
        System.out.println("HAHA MAIN"); //this line will not be executed if there exists an exception in previous line
    }
}
