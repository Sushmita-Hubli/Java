package Inner_classes;

class Outer1
{
    public void display()
    {
        class Inner1
        {
            public void show()
            {
                System.out.println("Showing!!");
            }
        }
        Inner1 i=new Inner1();
        i.show();

        //also we can create anonymous object here in this way :  new Inner1().show();
    }

}
public class local_inner_class
{
    public static void main(String[] args)
    {
        Outer1 o=new Outer1();
        o.display();

    }
}
