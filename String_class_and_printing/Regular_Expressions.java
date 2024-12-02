package String_class_and_printing;
import java.util.*;

public class Regular_Expressions
{
    public static void main(String[] args) {
        //Regular Expressions -- uses matches method for each character in string to check for similarity
        // . means any symbol present on keyboard
        // [abc] means exactly given letters
        // [abc][vz] means first char of string should be among abc and second one should be among vz
        // [^abc] means except abc
        //[a-z1-7] means a-z or 1-7
        // A|B means A or B
        //XZ means exactly XZ
        //  \d digits
        // \D not digits
        // \s Space
        // \S NOT A SPACE
        // \w ALPHABETS OR DIGITS
        // \W neither alphabets nor digits


        String str1="a";
        String str2="ab";
        String str3="abc";
        String str4="a9";
        String str5="efg";
        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
        System.out.println(str2.matches(".."));
        System.out.println(str3.matches("[abc]"));
        System.out.println(str3.matches("[abc][abc]"));
        System.out.println(str3.matches("[abc][abc][abc]"));
        System.out.println(str4.matches("[abc][0-9]"));
        System.out.println("\n\n");
        System.out.println(str4.matches("[a-c0-9]"));
        System.out.println(str4.matches("[a-c0-9][a-c0-9]"));
        System.out.println(str4.matches("[a-c]"));
        System.out.println(str3.matches("a|b"));
        System.out.println(str1.matches("a|b"));
        System.out.println(str5.matches("[^abc][^abc][^abc]"));
        System.out.println("\n\n");
        System.out.println(str1.matches("\\D"));
        System.out.println(str1.matches("\\w"));
        System.out.println(str1.matches("\\S"));



        //Quantifiers
        // * means 0 or more times
        // + one or more
        // ?  0 or more
        // {X} X times
        // {X,Y} Between X and Y time its like X or more than X till Y

        String haha="abcbbca";
        String haha1="";
        System.out.println("\n\n");
        System.out.println(haha.matches(".*"));
        System.out.println(haha.matches("[a-z]*"));
        System.out.println(haha.matches("[a-z0-9]*"));
        System.out.println(haha.matches("[abc]{6}"));
        System.out.println(haha.matches("[abc]{7}"));
        System.out.println(haha.matches("[abc]{3,6}"));
        System.out.println(haha.matches("[abc]{3,7}"));
        System.out.println(haha.matches("[abc]{4,7}"));
        System.out.println(haha.matches("[abc]+"));
        System.out.println(haha.matches("[abc]?"));


       //CONDITIONAL STATEMENT LEAP YEAR
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year : ");
        year=sc.nextInt();
        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                {
                    System.out.println("yes");
                }
                else
                {
                    System.out.println("not");
                }
            }
            else {
                System.out.println("yes");
            }

        }
        else {
            System.out.println("not");
        }


 //switch case -->type of website
        String website="neu.edu";
        String domain=website.substring(website.lastIndexOf(".")+1);
        switch (domain)
        {
            case "com":
                System.out.println("commercial");
                break;
            case "gov":
                System.out.println("government");
                break;
            case "org":
                System.out.println("organisation");
                break;
            case "edu":
                System.out.println("education");
                break;
            case "net":
                System.out.println("network");
                break;
            default:
                System.out.println("invalid!!");
                break;
        }










    }
}
