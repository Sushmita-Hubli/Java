package static_final;

class Test
{
    static int x=10;
    int y=20;
    void show()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
     //   System.out.println(x+" "+y);  //not allowed coz static methods can access only static members of the class

        System.out.println(x);
    }
}
public class static_one
{
    public static void main(String[] args)
    {
        //The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class rather than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.
        //The static keyword is a non-access modifier in Java that is applicable for the following:
        //Blocks
        //Variables
        //Methods
        //Classes

        //static is also said to store meta data
        //static members of a class are always created inside method area and not in heap


        Test t1=new Test();
        t1.show();  //op=10 20
        Test.display();//calling static method   //also static methods can only be accessed by using Classname.methodname anmd not object.methodname
        t1.x=30;
        t1.y=40;

        Test t2=new Test();
        t2.show();  //op=30 20
        //only x value is changed here bcoz its static and is referenced by all the objects of that class that is x is common for all the instances of that class

        //only a inner class can be static












    }
}
