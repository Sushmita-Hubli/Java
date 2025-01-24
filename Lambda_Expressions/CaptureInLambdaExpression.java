package Lambda_Expressions;


@FunctionalInterface
interface inter
{
    public void display();
}
class Demo
{
    public void method1()
    {
        MyLambda m1=()->{
            int count=0;
            count++;
            System.out.println("Hi");
            System.out.println("Bye");
            System.out.println(count);
        };
        m1.display();

    }
}
public class CaptureInLambdaExpression
{
    public static void main(String[] args) {
        System.out.println("What all can we do with a Lambda Expression");

        Demo d=new Demo();
        d.method1();

    }
}
