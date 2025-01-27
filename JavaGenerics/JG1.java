package JavaGenerics;

public class JG1
{
    public static void main(String[] args) {

        System.out.println("Java Generics");

        //problems faced before Java Generics was introduced

        Object obj=new String("Hello");
//        String str=obj;   this is not allowed and gives the error
        //we can achieve this by doing following:
        String str=(String) obj;  //this is called Type-casting


        //here if we dont execute line number 12 and instead do  obj=new Integer(10); and then if we write
        //String str=(String) obj; // then we dont see any error but when we run it , we get an exception.

        //conclusion:1. you can use reference of superclass to create object of child class
        //2.When we want to get back the actual object, then we have to do type casting as we have done in line number 12
        //3.proper typecasting should be done bcoz compiler doesnt check if proper type casting is done or not . we will face errors during run time if proper typecasting is not done.\


        Object[] objs=new Object[3];
        objs[0]="sush";
        objs[1]="pallu";
        objs[2]=11;   //so we will face a runtime error bcoz here we lack type safety since first two indices are strings and the third one is integer


String str1;
for(int i=0;i<3;i++)
{
    str1=(String) objs[i];
    System.out.println(str1);
}



//so bcoz of these things we use Generics to avoid these issues
        


    }
}
