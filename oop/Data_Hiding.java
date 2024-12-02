package oop;

class Rectangle1{
    private int length;
    private int breadth;
    public int getLength()
    {
        return length;
    }
    public void setLength(int l)
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
    public int getBreadth()
    {
        return breadth;
    }
    public void setBreadth(int b)
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
    public void isasquare()
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
public class Data_Hiding
{
    public static void main(String[] args) {

        Rectangle1 r=new Rectangle1();
       // r.length=2;     cant do this bcoz data member(length) is private
        // r.breadth=2;    cant do this bcoz data member(breadth) is private

        //instead we can usde the methods to set and get their values
        r.setLength(10);
        r.setBreadth(-3);
        r.area();
        r.perimeter();
        r.isasquare();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}
