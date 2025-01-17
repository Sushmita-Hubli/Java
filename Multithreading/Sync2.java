package Multithreading;


class ATM
{
    synchronized public void CheckBalance(Customer c)
    {
        System.out.println("Account balance of "+c.name+" is "+c.amount+" dollars");
    }

    synchronized public void withdraw(Customer c, int amt)
    {
        c.amount=c.amount-amt;

    }
}
class Customer extends Thread
{
    ATM a;
    public Customer(ATM a, String name, int amount)
    {
        this.a=a;
        this.name=name;
        this.amount=amount;
    }
   String name;
   int amount;

   public void run()
   {
     a.CheckBalance(this);
     a.withdraw(this,2000);
     a.CheckBalance(this);

   }
}
public class Sync2
{
    public static void main(String[] args) {
        ATM a=new ATM();
        Customer c1=new Customer(a,"Ashwin",7500);
        c1.start();
        Customer c2=new Customer(a,"Pallavi",3000);
        c2.start();


    }



}
