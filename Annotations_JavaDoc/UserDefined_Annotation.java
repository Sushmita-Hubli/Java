package Annotations_JavaDoc;


@interface  MyAnno
{

    String name();
}

@interface MyAnno2
{
    String name();
    String project();
    String date();
    String version() default "13";  //so if user doesnt write this , then we dont get any error coz default value is already mentioned
}

@MyAnno(name="Sushmita")
@MyAnno2(name = "Sushmita",project = "User defined Annotations",date = "01/21/2025",version = "2.0")
public class UserDefined_Annotation
{
    @MyAnno(name="Sushmita")
    int data;

    @MyAnno(name="Sushmita")
    public static void main(@MyAnno(name="Sushmita") String[] args) {

        @MyAnno(name="Sushmita") int x;


        System.out.println("Where all we can use Annotations:\n1.for a class\n2.for methods\n3.for arguments\n4.for local as well as instance fields.");

        System.out.println("once we define anything inside our Annotations, then it is mandatory to mention those fields wherever we will be using these Annotations");




    }
}
