package DataTypes_Variables_and_Literals;

public class Datatypes
{
    public static void main(String[] args) {

        //Range and size of data types

        //integer
        System.out.println("INT MIN VALUE= "+Integer.MIN_VALUE);
        System.out.println("INT MAX VALUE= "+Integer.MAX_VALUE);
        System.out.println("Size of Integer"+Integer.BYTES); //4

        //bytes
        System.out.println("BYTE");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.BYTES); //1

        //short
        System.out.println("Short");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.BYTES); //2

        //Long
        System.out.println("Long");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.BYTES);   //8

        //float
        System.out.println("Float");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.BYTES); //4

        //Double
        System.out.println("Double");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.BYTES); //8

        //char
        System.out.println("Character");
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.BYTES);   //2


       int averageNumberOfClass;//camel case followed by java

        //Literals for example
        int value=25; //here 25 is literal which is integer type of literal
        double area= 3.2425*value*value; //here 3.2425 is a doble type of literal
        //byte,short and int data types take integer type of literal
        //if we write 5L or 5l then it is long type of literal
        //if we write 2.5f or 2.5 F it is float type of literal
        //if we write 2.5d or 2.5D or 2.5 it is double type of literal
        //if we write in '' it is char type of literal
        //if we write true or false then it is boolean type of literal

        byte b1=10; //decimal format
        byte b2=0b1010;//binary format
        byte b3=012; //octal format
        byte b4=0XA; //hexadecimal

        System.out.println(b1);
        System.out.println(b2+" "+b3+" "+b4);


        //
        int x=5;
        System.out.println(Integer.toBinaryString(x));
        int y=-5;
        System.out.println(Integer.toBinaryString(y)); //output will be 2's complement of +5


        //floating number arestored in following way--> for example your number is 66.77 then it is stored as 6677E-2


        //ASCII Codes
        //A-->65 , a-->97 ,0-->48

    }
}
