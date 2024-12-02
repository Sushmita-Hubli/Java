package Exception_Handling;

public class TRY_WITH_RESOURCES
{
    public static void main(String[] args)
    {

        //finally block is usually written to close the resources. if a program crashes due to error and if the code to release the resources is written below the exception causing line, then the program crashes even before the memory of resources is released
        //to avoid this, finally block is written below try block
        //we can also release resources without writing finally block if we use try block with resources.
        //in conclusion, it is always required to release the resources before the program ends or crashes due to some exceptions

        
    }
}
