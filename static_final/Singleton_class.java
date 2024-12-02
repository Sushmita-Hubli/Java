package static_final;

class CoffeeMachine
{
    private int coffeeQty;
    private int milkQty;
    private int waterQty;
    private int sugarQty;

    static private CoffeeMachine my=null;   //once the object will be created using getinstanceof() method, it will no longer point to null

    private CoffeeMachine()  //since the construcrtor is private, we cannot create object of this class by using new keyword
    {
        coffeeQty=1;
        waterQty=1;
        sugarQty=1;
        milkQty=1;
    }
   static CoffeeMachine getInstance()  //this method is created so that we can create object of this class in our main class with a restriction that only one object will be created
    {
        if (my==null)
        {
            my=new CoffeeMachine();
        }
        return my;
    }
}
public class Singleton_class
{
    public static void main(String[] args) {
        //singleton class is a class whose only one object can be created

        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();

        if (m1==m2 && m2==m3)
        {
            System.out.println("haha they're same!!");
        }



    }
}
