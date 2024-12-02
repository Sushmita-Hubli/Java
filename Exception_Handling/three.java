package Exception_Handling;
import  java.util.*;


public class three
{
    public static void main(String[] args) throws Exception {

        //Checked exceptions
        //These are problems that are anticipated and must be planned for in advance. The programmer must either handle them or declare that the method might throw them. Examples of checked exceptions include IOException, SQLException, and ClassNotFoundException.
        //Unchecked exceptions
        //These are problems that are not anticipated and are often due to programming errors. The programmer can handle them if they want, but they are not required to. Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and IllegalArgumentException.

        //Exception is the mother class of all Exceptions
        //Creating our own exception class requires extending from the Exception class and overriding its methods( String toString() , String getMessage() );
        int balance;
        Scanner sc=new Scanner(System.in);

            balance=sc.nextInt();

                if (balance<10)
                {
                    throw new Exception("balance is less than required ");
                }


//so in order to throw an exception, the method where exception is about to be checked should include throws Exception for example "public void display() throws Exception{//body}" after doing this , we can throw a exception in method body




    }
}
