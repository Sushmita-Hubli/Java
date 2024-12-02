package Inner_classes;


class Outer3
{
    int x=10;
    static int y=20;

    static class Inner3
    {
        public void show()
        {
           // System.out.println(x+" "+y);  this will give erroe bcoz x is not static . conclusion is that a static inner class can access only static members of outer class
            System.out.println("y = "+y);
        }
    }
}
public class static_inner_class
{
    public static void main(String[] args)
    {
        Outer3.Inner3 o=new Outer3.Inner3();
        o.show();

        //IF WE WANT TO ACCESS NON SGTATIC MEMBER THEN WE HAVE TO CREATE OBJECT OF OUTER CLASS AND THEN PRINT THE VALUE OF X


    }
}
