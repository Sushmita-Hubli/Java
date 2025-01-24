package Lambda_Expressions;


interface Lamb1
{
    public void display(String str);
}

class Lamb2
{
    public static void reverse(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        String a= String.valueOf(sb.reverse());
        System.out.println(a);
    }
    public void Reverse(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        String a= String.valueOf(sb.reverse());
        System.out.println(a);
    }
}
public class Method_Reference {
    public Method_Reference(String s)
    {
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        System.out.println("Method Reference in Lambda Expression");

        Lamb1 m1=System.out::println;  //here we have converted the method present inside the lambda expression as println so whenever we call the method display , it acts like a println function of System class
        m1.display("Sushmita");

        Lamb1 m2=Lamb2::reverse; //this is called as method reference
        m2.display("HAHA");

        //non-static instance method
        Lamb2 a=new Lamb2();
        Lamb1 m4=a::Reverse;
        m4.display("Priya");

        //we can even assign constructor
        Lamb1 m3=Method_Reference::new;
        m3.display("Ashwin");





    }
}
