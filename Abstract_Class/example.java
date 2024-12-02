package Abstract_Class;

abstract class Super          //here writing abstract keyword is necessary bcoz the one of the methods of class are abstract so the class is also abstract
{
    public Super()
    {
        System.out.println("Super Constructor");
    }
    public void meth1()
    {
        System.out.println("Method 1 of super class");
    }

    abstract public void meth2();  //here writing abstract keyword is necessary bcoz method is abstract i.e it has no body
}

class Subclass extends Super  //this is a concrete class(concrete class is a class whose object can be created)
{
    public Subclass()
    {
        System.out.println("Subclass Constructor");
    }

    @Override
    public void meth2()
    {
        System.out.println("This is method 2 of subclass");
    }
}
public class example
{
    public static void main(String[] args)
    {

      // Super c=new Super(); //we cannot create objects of abstract classes but we can create reference of abstract class
        // if any method in a class is abstract i.e if it doesn't have a body, then the class in which it is declared is abstract so in this situation it is necessary to write abstract keyword in front of class and also in front of method name
        //an abstract class may or may not have a abstract method but if in a class if any method is abstract then that class is also called as abstract class
        //the purpose of creating abstract classes is purely for inheritance since we cannot create object of abstract classes, we can inherit its properties into subclass which inherits from abstract class and perform certain actions
        //the subclass which inherits from the superclass (abstract class) must override the abstract method if it fails to do so , then it must also be declared as abstract
        //abstract class and abstract methods cannot be declared as final and static

        Super s=new Subclass();
        s.meth1();
        s.meth2();


    }
}
