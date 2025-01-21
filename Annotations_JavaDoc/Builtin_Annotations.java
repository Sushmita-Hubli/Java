package Annotations_JavaDoc;


abstract class Parent
{
    abstract public void display();
}
class Child extends Parent
{
    @Override
    public void display()
    {
        System.out.println("haha");
    }
}
class Oldclass
{
    public void display()
    {
        System.out.println("displaying");
    }


    @Deprecated
    public void show()  //we dont want to use this in future so we suggest the programer to use @Deprecated annotation.now when you create object of this class you will see striked show method coz it is deprecated.
    {
        System.out.println("Hi");
    }
}

class My<T>
{
    @SafeVarargs   //now because of this annotation, we dont get any warning of unchecked and unsafe when we compile the program
    //method must be private or final to use this Annotation
    private void show(T...arg)
    {
        for(T x:arg)
        {
            System.out.println(x);
        }
    }
}

@FunctionalInterface  //an interface is a functional interface if it has only one method. developers use this annotation while programming to make sure that there is only one method in this interface. if there are more methods, then we will get an error
interface My1
{
    public void show();
}

public class Builtin_Annotations
{
    @SuppressWarnings("deprecation")   //now when we compile the program, then we cannot see any warning when we try to use any deprecated method or field
    public static void main(String[] args) {
        System.out.println("Annotations in Java are metadata tags that provide information about the code but do not change its execution. They are used to provide additional data to the compiler or runtime environment, helping in tasks like code analysis, compilation, and runtime processing. Common built-in annotations include @Override, @Deprecated, and @SuppressWarnings. Developers can also create custom annotations for specific purposes in their applications.");

        Oldclass o=new Oldclass();
//        o.show();   we will get a warning when we compile the program but we can still use this method. it is programmers good practice to write it




    }
}
