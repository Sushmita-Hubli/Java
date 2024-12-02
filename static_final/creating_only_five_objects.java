package static_final;


class HAHA
{
    private int x;
    private int y;

    static private HAHA my;
    static int count=1;
    private HAHA()
    {
        x=10;y=20;
    }

    static HAHA getInstance()
    {
        while (count<6)
        {
            my=new HAHA();
            System.out.println("count is "+count);
            count++;
        }
        return my;
    }
}
public class creating_only_five_objects
{
    public static void main(String[] args)
    {
        HAHA one=HAHA.getInstance();
        HAHA two=HAHA.getInstance();
        HAHA three=HAHA.getInstance();
        HAHA four=HAHA.getInstance();
        HAHA five=HAHA.getInstance();

        //no new objects are created from here
        HAHA six=HAHA.getInstance();
        HAHA seven=HAHA.getInstance();

    }
}
