package LangPackage;
import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My()
    {
    }
    public My(int x,int y){}
    public void display(String s1, String s2){}
    public int show(int x,int y){return 0;}
}
public class Reflect_Package
{
    public static void main(String[] args) {
        System.out.println("reflect package\nThe java.lang.reflect package in Java provides classes and interfaces for obtaining reflective information about classes and objects. It allows you to:\n" +
                "\n" +
                "Inspect classes, methods, fields, and constructors at runtime.\n" +
                "Create instances, invoke methods, and access fields dynamically. This package is commonly used for advanced features like frameworks, libraries, and tools that operate on unknown classes or objects at runtime.");

        //getting class info
        Class c=My.class; //way 1
        My m=new My();
        Class c2=m.getClass();//way 2

        System.out.println(c2.getName());
        System.out.println();

        //getting every field from class My
        Field f[]=c.getDeclaredFields();
        for(Field f1:f)
        {
            System.out.println(f1);
        }


        System.out.println();
        //getting every constructor
        Constructor c1[]=c2.getConstructors();
        for(Constructor a:c1)
        {
            System.out.println(a);
        }
        System.out.println();

        //getting methods
        Method me[]=c2.getMethods();
        Method me2[]=c2.getDeclaredMethods();
        for(Method m1:me)
        {
            System.out.println(m1);
        }
        System.out.println();
        for(Method m2:me2)
        {
            System.out.println(m2);
        }

        System.out.println();
//extracting parameters from a method
        Parameter param[]=me[0].getParameters();
        for(Parameter p:param)
        {
            System.out.println(p);
        }

    }
}
