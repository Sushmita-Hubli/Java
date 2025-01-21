package Lambda_Expressions;


@FunctionalInterface
interface MyLambda
{
    public void display();
}

//class My implements MyLambda
//{
//    @Override
//    public void display()
//    {
//        System.out.println("HAHA");
//    }
//}   instead of doing this we can make use of inner class or by using Lambda Expression
public class LE1
{
    public static void main(String[] args) {

        MyLambda m=new MyLambda() {
            @Override
            public void display() {
                System.out.println("HAHA");
            }
        };

        m.display();

        MyLambda m2= ()->{System.out.println("HAHA");};
        m2.display();

    }
}
