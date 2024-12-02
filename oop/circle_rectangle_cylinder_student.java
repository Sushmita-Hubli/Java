package oop;

class Circle{
    double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

class Rectangle{
    public int length;
    public int breadth;
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
class Cylinder
{
    public int height;
    public double radius;
    public void lidArea()
    {
        System.out.println("lid area = "+Math.PI*radius*radius);
    }
    public void totalSurfaceArea()
    {
        double total=2*Math.PI*radius*(radius+height);
        System.out.println("Total Surface Area = "+total);
    }
    public void volume()
    {
        System.out.println("Volume= "+Math.PI*radius*radius*height);
    }
}
class Student
{
    public int roll_no;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total()
    {
       return m1+m2+m3;
    }
    public double Average()
    {
        return total()/3;
    }
    public void Grade()
    {
        if (Average()>=60)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }

    public String toString()
    {
        return name+" "+roll_no;
    }
}
public class circle_rectangle_cylinder_student
{
    public static void main(String[] args)
    {
        Circle c=new Circle();
        c.radius=2;
        System.out.println("Area: "+c.area());
        System.out.println("Perimeter = "+c.perimeter()+"\nCircumference = "+c.circumference());

        Rectangle r=new Rectangle();
        r.length=1;
        r.breadth=2;
        System.out.println();
        r.area();
        r.perimeter();
        r.isasquare();



        Cylinder c1=new Cylinder();
        c1.radius=1;
        c1.height=2;
        System.out.println();
        c1.lidArea();
        c1.totalSurfaceArea();
        c1.volume();


        Student s1=new Student();
        s1.name="Sushmita";
        s1.roll_no=4228;
        s1.m1=99;
        s1.m2=98;
        s1.m3=95;
        System.out.println();
        System.out.println("Total : "+s1.total());
        System.out.println("Average : "+s1.Average());
        s1.Grade();
        System.out.println("Details: "+s1); //this calls toString() method

    }
}
