package Inner_classes;

abstract class My
{
    abstract public void show();
}
class Outer2
{
    public void display()
    {
        My m=new My(){
            public void show()
            {
                System.out.println("Showing haha!!");
            }
        };  //this is a anonymous class
        m.show();
    }
}
public class Anonymous_inner_class
{
    public static void main(String[] args)
    {
        Outer2 o=new Outer2();
        o.display();

    }
}
