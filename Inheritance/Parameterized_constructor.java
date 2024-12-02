package Inheritance;

class Rectangle
{
    private int l;
    private int b;
    public Rectangle()
    {
        System.out.println("non param of Rectangle");
        l=b=1;
    }
    public Rectangle(int l,int b)
    {
        l++;
        b++;
        this.l=l;
        this.b=b;
        System.out.println("Param of Rectangle len="+l+" breadth="+b);
    }
    public void perimeter()
    {
        System.out.println("Perimeter="+2*(l+b));
    }
    public int area()
    {
        return l*b ;
    }

}
class Cuboid extends Rectangle
{
    private int height;
    public Cuboid()
    {
        System.out.println("non param of Cuboid");
        height=1;
    }
    public Cuboid(int h)
    {
        System.out.println("Param of cuboid with one parameter");
        this.height=h;
    }
    public Cuboid(int l,int b,int h)
    {

        super(l,b); //should always be the first statement
        System.out.println("param of cuboid with 3 parameters: len = "+l+" breadth="+b+" height"+h);
        this.height=h;

    }
    public void volume()
    {
        System.out.println("Volume= "+area()*height);
    }
}
public class Parameterized_constructor
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        System.out.println();
        Rectangle r1=new Rectangle(2,3);  //3,4
        System.out.println();
        r1.perimeter();
        System.out.println();
        System.out.println();

        Cuboid c1=new Cuboid(); //super class non param+child class non param
        System.out.println();
        Cuboid c2=new Cuboid(1,1,1);  //param of rectangle 2,2 +param of cuboid with 3 param 1,1,1
        c2.volume();

        System.out.println();
        Cuboid c3=new Cuboid(2);  //non param of rectangle + param of cuboid with one parameter
        System.out.println();
        c3.volume();
        c3.area();


        //conclusion: If no super() call is made, the parent class's no-argument constructor is called by default whenever we create the object of child class
        //Implicit Call to Parent Constructor: In Java (or similar object-oriented languages like C++), when a child class object is instantiated, the constructor of the parent class is invoked before the child class's constructor. If no super() call is made, the parent class's no-argument constructor is called by default.
        //
        //If the Parent Class Has a Non-Parameterized Constructor: If the parent class has a default constructor (non-parameterized), it will be called automatically when an instance of the child class is created, even if the child class constructor is parameterized.
        //
        //If the Parent Class Has Only Parameterized Constructors: If the parent class does not have a non-parameterized constructor, then you must explicitly call one of the parameterized constructors of the parent class using super() in the child class's constructor.


    }
}
