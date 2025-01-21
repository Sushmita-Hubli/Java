package Annotations_JavaDoc;


import java.lang.annotation.Documented;
import java.lang.annotation.*;


// @Target(value = ElementType.LOCAL_VARIABLE)  //this means that we can use our defined Annotations only on the local variables
@Retention(RetentionPolicy.CLASS)  //we will get details about our defined Annotation using reflect package in our code when we use this
@Documented   //will be used in documentation when we use javadoc
@interface MyAnno3
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

@MyAnno3(name = "Sushmita", project = "myproj",date = "tomorrow",version = "2.0")
public class Builtin_Annotations_pt2
{
    @MyAnno3(name = "Sushmita", project = "myproj")
    int data;

    @MyAnno3(name = "Sushmita", project = "myproj",date = "tomorrow")
    public static void main( @MyAnno3(name = "Sushmita", project = "myproj")
                                 String[] args)
    {

        @MyAnno3(name = "Sushmita", project = "myproj")
        int x;

        System.out.println("Herewe have used the built in Annotations which are applicable only on user defined Annotations");
    }
}
