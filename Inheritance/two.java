package Inheritance;

class Parent
{
    public Parent()
    {
        System.out.println("Parent class Constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child class Constructor");
    }
}
public class two
{
    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println();
        Child c=new Child();   //constructor of parent class and child class will be both executed but the execution will be of parent class first

    }
}
