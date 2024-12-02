package static_final;

class Block
{
    static int s;
    static
    {
        System.out.println("Hellew");
        s=20;
    }
    static
    {
        System.out.println("s = "+s);

    }
}
public class staticBlock
{
    static
    {
        System.out.println("inside main class block 1");
    }
    public static void main(String[] args)
    {
        //static block can have access to only static members(members can be data members or methods)
        //all the static blocks are executed in the order in which they are written in the class

        Block b=new Block();
        System.out.println("main method"); //this will execute in the last

    }
    static
    {
        System.out.println("inside main class block 2");
    }
}
