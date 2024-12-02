package static_final;

class Test1
{
   public final void display()
   {
       System.out.println("display in parent class");
   }
}
class Test2 extends Test1
{

    /*This is not allowed bcoz the method in parent class is final so it cannot be overridden in the subclass
    public void display()
    {
        System.out.println("display in child class");
    }
     */

}

//example of final class
final class Hungama
{
    public void display()
    {
        System.out.println("haha");
    }
}


/* this cannot happen bcoz iot is inheriting from a final class . inheriting from final class is not allowed in java
class Shinchan extends Hungama
{

}
 */
public class final_methods
{
    public static void main(String[] args) {

    }
}
