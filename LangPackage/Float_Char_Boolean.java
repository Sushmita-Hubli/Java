package LangPackage;

public class Float_Char_Boolean
{
    public static void main(String[] args) {
        System.out.println("Float Clas");
        float a=12.5f;
        Float b=12.5f;
        Float c=12.5f/0;
        Float d=-12.5f/0;
        Float e=(float)Math.sqrt(-1);  //here we have typecasted it into float because sqrt method returns a double value
        System.out.println("equals " +b.equals(a));
        System.out.println("isinfinite "+c.isInfinite(c));// output will be true and not an division by zero exception bcoz float values do nit give division by zero exception
        System.out.println("ispositiveinfinite "+ (c==Float.POSITIVE_INFINITY));
        System.out.println("isnegativeinfinite "+(c==Float.NEGATIVE_INFINITY));
        System.out.println("isnegativeinfinite "+(d==Float.NEGATIVE_INFINITY));
        System.out.println("Not a Number "+e.isNaN());
//        System.out.println("Not a Number "+(e==Float.NaN));  do not ever use this method coz it gives a wrong output .



        //Character Class
        Character f='a';
        Character g=Character.toUpperCase(f);

        //Boolean Class
        Boolean h=false;
        Boolean i=Boolean.parseBoolean("true");

        



    }
}
