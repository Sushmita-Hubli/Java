package Exception_Handling;

import java.util.Scanner;

public class four
{

    static void meth2(int balance) throws Exception
    {
        if (balance<10)
        {
            throw new Exception("Balance should not be less than 10");
        }
        else
        {
            System.out.println("Balance is valid!!");
        }
    }
    static void meth1(int balance)
    {
        try
        {
            meth2(balance);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        //one more way
        int balance2;
        System.out.println("Enter value for balance 2");
        Scanner sc=new Scanner(System.in);
        balance2=sc.nextInt();

        meth1(balance2);

        //ok so it is necessary to write try-catch block to handle exceptions but if the user dont want to write try-catch block then he must keep on writing "throws Exception" every time in front of the methods where exceptions are likely to happen . i mean till the main methiod
        //detailed demonstration is showed in next code i.e five.java of Exception_Handling package

    }
}
