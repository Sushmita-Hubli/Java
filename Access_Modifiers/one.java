package Access_Modifiers;

public class one
{
    public static void main(String[] args)
    {
        //Outer class can only be default or public it cannot be private or protected


        //we can access everything that is default,private,protected and public within a same class


        //creating table to understand access-modifiers
        System.out.println("                      "+"   default"+" private"+" protected"+" public");
        System.out.println("same class            "+"   yes    "+" yes    "+" yes      "+" yes   ");
        System.out.println("same pack subclass    "+"   yes    "+" no     "+" yes      "+" yes   ");
        System.out.println("same pack non subclass"+"   yes    "+" no     "+" yes      "+" yes   ");
        System.out.println("diff pack  subclass   "+"   no     "+" no     "+" yes      "+" yes   ");
        System.out.println("diff pack non subclass"+"   no     "+" no     "+" no       "+" yes   ");

    }
}
