package Exception_Handling;

public class one
{
    public static void main(String[] args) {
        //Exception Handling in Java is one of the effective means to handle runtime errors so that the regular flow of the application can be preserved. Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

        //while dealing with multiple exception handling i.e when we make multiple catch blocks, we should make sure that the first catch block's exception(class used in paranthesis) should be child of the later catch blocks class in paranthesis otherwise the first catch block may overshadow the other catch block's execution

        //finally block is always executed no matter what . it should be written after try block
        //or try-catch blocks

        int a[]={4,0,11,22};
        try
        {
            int c=a[0]/a[1];
            System.out.println(c);
            System.out.println("haha");  //this line will not be executed directly control goes to catch block and then finally block
            System.out.println(a[10]); //this line will not be executed directly control goes to catch block and then finally block
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Hellew!!");
        }

    }
}
