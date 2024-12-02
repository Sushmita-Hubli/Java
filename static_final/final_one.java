package static_final;

public class final_one
{
    /*not allowed
   static final int z;
   z=24;
    */

    static final int z=24; //this is allowed   -- method 1 of initialization
    //so the conclusion is , final variables can be declared and later on they can be initialized only inside methods ,
    // but if you want to declare them inside a class then they must be initialized then itself along with declaration

     /*Allowed but this cannot be accessed inside main method unless we make an object of the class and then try to access it
   final int a;
    {
        a=10;
    }

      */


     /*Allowed
    static final int a;
    static
    {
        a=10;
    }
    */

    final int a; //can be accessed inside main method in following way follow line no: 60    --method 2 of initialization
    {
        a=10;
    }


    //also we can initialize final members inside constructor of the class -- method 3
    final int s;
    public final_one()
    {
        s=24;
    }

    public static void main(String[] args)
    {
        //final variables cannot we modified
        //final methods cannot be overridden
        //final classes cannot be inherited

        //initialization of final variables is must


        final int x=10;

        //allowed this way
        final int y;
        y=40;
        //

        final_one f=new final_one(); System.out.println(f.a);

    }
}
