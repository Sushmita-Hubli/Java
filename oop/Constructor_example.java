package oop;


class Rectangle2{
    public int length;
    public int breadth;

    //constructors
    public Rectangle2()
    {
        length=1;
        breadth=1;
    }
    public Rectangle2(int l,int b) //parameterized constructor
    {
        setLength(l);
        setBreadth(b);
    }
    public Rectangle2(int m) //parameterized constructor
    {
        setLength(m);
        setBreadth(m);
    }


    public int getLength()   //property method
    {
        return length;
    }
    public void setLength(int l) //property method
    {
        if (l>0)
        {
            length=l;
        }
        else
        {
            length=0;
        }

    }
    public int getBreadth()   //property method
    {
        return breadth;
    }
    public void setBreadth(int b)   //property method
    {
        if (b>0)
        {
            breadth=b;
        }
        else
        {
            breadth=0;
        }

    }
    public void area()
    {
        System.out.println("area of rectangle = "+length*breadth);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of rectangle = "+2*(length+breadth));
    }
    public void isasquare()      //enquiry method
    {
        if (length==breadth)
        {
            System.out.println("Rectangle is a square");
        }
        else {
            System.out.println("Rectangle is not a square");
        }
    }
}
public class Constructor_example
{
    public static void main(String[] args)
    {
        Rectangle2 r=new Rectangle2();
        r.area();
        Rectangle2 r2=new Rectangle2(2,2);
        r2.area();
        Rectangle2 r3=new Rectangle2(1);
        r3.area();
        Rectangle2 r4=new Rectangle2(-10,-4);
        r4.area();

    }
}
