package Exception_Handling;

import java.util.Scanner;

class negException extends Exception
{
    public String toString()
    {
        return "Negative number not allowed.";
    }

}
public class user_defined_exception_classes
{
    static void area(int l,int b) throws negException
    {
        if (l<0 || b<0)
        {
            System.out.println("haha areA");
            throw new negException();
           // System.out.println("haha areA"); ANYTHING BELOW THEN THROW LINE IS NOT ALLOWED compiler considers it as a unreachable statement


            //if in case you want to execute something after try block then you can do it in following way:
            /*

             try
             {
              throw new negException();
             }
             finally
             {
             System.out.println("haha areA")
            }
            */

        }
        else {
            System.out.println("Area is : "+(l*b));
        }
    }
    public static void main(String[] args)
    {
        int len,br;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of length : ");
        len=sc.nextInt();
        System.out.println("Enter value of breadth : ");
        br=sc.nextInt();
        try
        {
            area(len,br);
        }
        catch(negException e)
        {
            System.out.println(e);
        }
        System.out.println("HAHA MAIN");  // NOW THIS LINE GETS EXECUTED BECAUSE THE EXCEPTION IS BEING HANDLED WITH THE HELP OF TRY-CATCH BLOCK



    }
}
