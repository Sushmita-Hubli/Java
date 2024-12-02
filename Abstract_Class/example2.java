package Abstract_Class;

abstract class Parent
{
    public Parent()
    {
        System.out.println("Parent constructor");
    }
    abstract public void display();
}

abstract class Child extends Parent
{
    public Child()
    {
        System.out.println("Child constructor");
    }

    //if a subclass inherits from a abstract class, then it must override the abstract method of super class if it doesnt do that , then kit must be declared as abstract

}
class Grandchild extends Child
{
    public Grandchild()
    {
        System.out.println("Grandchild constructor");
    }
    public void display()
    {
        System.out.println("displayed");
    }
}
public class example2
{
    public static void main(String[] args) {

        Child c=new Grandchild();
        c.display();



    }
}
