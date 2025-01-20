package LangPackage;

public class Wrapperclass
{
    public static void main(String[] args) {
        System.out.println("Wrapper Classes\n" +
                "\n" +
                "A wrapper class in Java is an object representation of a primitive data type. It provides a way to use primitive types (int, char, etc.) as objects. Each primitive type has a corresponding wrapper class, such as Integer for int, Double for double, and Character for char. Wrapper classes are used to convert primitives into objects, which is useful when working with collections, serialization, or methods that require objects.");

        //There are 3 ways of creating an object of Wrapper class
        Integer a=10;
//        Integer b=new Integer(2);
        Integer c=Integer.valueOf(3);

        Byte d=15;
        Byte e=Byte.valueOf("13");
//        Byte f=Byte.valueOf(14);  //this line will cause problem bcoz we are passing integer value inside parenthesis
        //so to resolve the above issue we write
        byte bb=14;
        Byte f=Byte.valueOf(bb);

        Short g=Short.valueOf("1323");

        Float h=12.3f;
        Float i=Float.valueOf("123.5");

        Double j=Double.valueOf(123.44);

//        Character k=Character.valueOf("a");  not allowed
        Character k=Character.valueOf('a');

        Boolean l=Boolean.valueOf("true");
        Boolean m=Boolean.valueOf(false);


        //Boxing and Autoboxing
        int n=33;
        Integer o=Integer.valueOf(n); //boxing
        Integer p=n; //Autoboxing

        int q=p;  //autounboxing
        int r=p.intValue(); //unboxing







    }
}
