package Inheritance;

class Super
{
    public void display()
    {
        System.out.println("method of super class");
    }
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("method of sub class");
    }
}
public class Method_Overriding
{
    public static void main(String[] args)
    {
        Super c=new Super();
        c.display();  //super
        System.out.println("haha");
        Sub c1=new Sub();   //sub
        c1.display();
        System.out.println("haha");
        Super c2=new Sub();   //even though the reference is of super class, the object is of subclass so when we call any method using this object,method of subclass will be displayed this is called as dynamic method dispatch
        c2.display();   //sub


    }
}
