package Lambda_Expressions;


@FunctionalInterface
interface Lam1
{
    public void display1();
}

@FunctionalInterface
interface Lam2
{
    public void display(String name);
}

@FunctionalInterface
interface Lam3
{
    public void add(int x, int y);
}
public class LE2
{
    public static void main(String[] args) {
        System.out.println("Types of Lambda Expressions\nParameters in a Lambda Expression");
        Lam1 l1=()->{
            System.out.println("Hello");
        };
        l1.display1();


        Lam2 l2=(s)->{
            System.out.println(s);
        };
        l2.display("Shreya");

        Lam3 l3=(a,b)->{
            System.out.println("Addition is "+(a+b));
        };
        l3.add(2,3);

        

    }
}
