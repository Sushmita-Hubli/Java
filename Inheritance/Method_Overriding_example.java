package Inheritance;

import java.security.PublicKey;

class TV{
    public void switchon()
    {
        System.out.println("TV switched on");
    }
    public void changechannel()
    {
        System.out.println("TV Channel changed");
    }
}

class SmartTV extends TV{
    @Override
    public void switchon()
    {
        System.out.println("SmartTV switched on");
    }

    @Override
    public void changechannel()
    {
        System.out.println("SmartTV channel changed");
    }

    public void browse()
    {
        System.out.println("SmartTV is browsing");
    }
}
public class Method_Overriding_example
{
    public static void main(String[] args)
    {
        TV t=new TV();
        t.changechannel();
        t.switchon();

        System.out.println();
        SmartTV s=new SmartTV();
        s.changechannel();
        s.browse();
        s.switchon();

        System.out.println();
        TV t1=new SmartTV();
        t1.changechannel();
        t1.switchon();
         // t1.browse();  we cannot execute this method because even though the reference is of super class and object is of subclass but these type of objects can only display methods which are present in the super class .
        //In case the method is overriden in subclass, and if reference is of super but object is of subclass, then the overriden method in the subclass will be displayed as output
        //This is called as Dynamic Method Dispatch (DMD) . Dynamic Method Dispatch is the mechanism used to achieve Runtime Polymorphism in object-oriented programming, as it allows the correct method to be called at runtime based on the actual object type, rather than the reference variable type, essentially enabling polymorphic behavior.
        //static and final methods cannot be overriden in the subcalss
        //access modifiers of the overriden method and original method can be different based on a condition:  the access modifier of the overriden method should be same as of original method or it should be lenient
        //method overloading is called as compile time polymorphism whereas method overriding is called as runtime polymorphism\



    }
}
