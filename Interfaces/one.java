package Interfaces;

interface Test
{
    //we can have data members in interfaces but they are always static and final(constant)
    int x=10;  //these are by default static and final so we need not have to write it in front of data member

    //interface can have static method with body
    public static void meth3()
    {
        System.out.println("Method 3");
    }
    void meth1();
    void meth2();

    default void meth5()  //we can also have default methods in the interface and it can have body
    {
        System.out.println("meth5");
    }

    //we can have private methods inside a interface but they cannot be abstract also they can be accessible only inside that interface
    private void meth6()  //this method will be internally used within the interface maybe say default method may use this method
    {
        System.out.println("meth6");
    }
}
class implementer implements Test
{
    public void meth1()
    {
        System.out.println("Method 1");
    }
    public void meth2()
    {
        System.out.println("Method 2" +
                "");
    }
}
interface Test2 extends Test   //one interface can extend from another interface
{
    void meth4();
}
class HAHA implements Test2{
    //now here we have to override all the methods from Test as well as Test2 bcoz it implements from Test 2 and Test2 extends from Test
   public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
    public void meth4()
    {
        System.out.println("meth4");
    }
}
public class one
{
    public static void main(String[] args) {
        //Key differences:
        //Implementation details:
        //Abstract classes can have concrete methods (with implementations) alongside abstract methods, while interfaces only have abstract methods (no implementations).
        //Inheritance:
        //A class can only inherit from one abstract class, but it can implement multiple interfaces.
        //Usage:
        //Use an abstract class when you want to provide some common functionality to related classes, while use an interface when you want to define a contract that can be implemented by diverse classes with different implementations.


        Test t=new implementer();
          t.meth1();
          t.meth2();

        System.out.println();
        System.out.println(Test.x);//since it is static we can directly access it using interface name without even creating an object of that interface
        Test.meth3();

        //new
        Test2 t1=new HAHA();
        t1.meth1();
        t1.meth2();
        t1.meth4();
      //  Test2.meth3(); we cannot do this bcoz we can call tbhis method only when we use interface name . the method name
        t1.meth5(); //since it is a default method , we can call it



    }
}
