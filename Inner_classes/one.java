package Inner_classes;

class Outer
{
    int x=10; //if x is defined as static, it can still be accessed inside the inner class
    //also we can create object of Inner class here even before the Inner class code has been written in the following way:
    // Inner i=new Inner()  // this does not set any limitations in java . These were the limitations of languages like C++ and other Object oriented languages
    class Inner
    {
        int y=20;
        public void Innerdisplay()
        {
            System.out.println("Inner display : x= "+x+" y= "+y);
        }
    }

    public void OuterDisplay()
    {
        Inner i=new Inner();
        i.Innerdisplay();
        System.out.println("y of inner class using object of inner class  : "+i.y);
      //  System.out.println(y);//gives an error
    }
}
public class one
{
    public static void main(String[] args) {

        //In Nested inner claases, the inner class can access the members of outer class directly but the outer class can access the members of inner class only by craeting the object of the inner class
        Outer o=new Outer();
        o.OuterDisplay();

        //if we want to create object of inner class then the steps are as follows:
        Outer.Inner i=new Outer().new Inner();
        i.Innerdisplay();

        //for every class in java, a seperate .class file is generated in build folder of code location
        //here for inner class it will be  : Outer$Inner.class ,  for outer class it will be Outer.class, and for main class it will ve one.class

    }
}
