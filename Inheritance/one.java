package Inheritance;

class Circle{
    public double radius;

    public void area()
    {
        System.out.println("Area = "+Math.PI*radius*radius);
    }
    public void perimeter()
    {
        System.out.println("Perimeter = "+2*Math.PI*radius);
    }
}
class Cylinder extends Circle
{
    public double height;
    public void volume()
    {
        System.out.println("Volume = "+Math.PI*radius*radius*height);
    }
}
public class one
{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=1.1;
        c1.area();

        Cylinder c2=new Cylinder();
        c2.radius=1.1;
        c2.height=2;
        c2.area();
        c2.volume();

    }
}
