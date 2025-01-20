package LangPackage;


enum Dept
{
    CS,IT,ENTC("sushmita","block A"),ECE;

    private Dept()   //enum can have private or default it should not be public or protected
    {

        System.out.println("constructor: \n"+this.name());

    }
    String head,location;
    private Dept(String head,String location)
    {
        this.head=head;
        this.location=location;
        System.out.println("constructor: \n"+this.name());

    }

    public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }

    public String headName()
    {
        return head;
    }
    public String locationName()
    {
        return location;
    }
}
public class Enum
{
    public static void main(String[] args) {
        System.out.println("Enum: Enumerated datatypes: user defined data type");
        Dept d=Dept.CS;
//        Dept e=1;   gives error coz we can assign only the values that are written inside enum Dept
        System.out.println(d.ordinal());  //output will be index of d
        System.out.println(Dept.valueOf("IT"));//IF SOMETHING IS MATCHING TO it IN THE dEPT ENUM THEN THE OUTPUT WILL BE IT otherwise it gives IllegalArgument Exception
        Dept list[]=Dept.values();
        System.out.println();
        for(Dept x:list)
        {
            System.out.println(x);
        }

        System.out.println();
        d.display(); //we can use this d like a object

        System.out.println(d.headName());
        System.out.println(d.locationName());

        System.out.println();
        Dept e=Dept.ENTC;
        System.out.println(e.headName());
        System.out.println(e.locationName());


    }
}
