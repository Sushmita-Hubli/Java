package loops;
import java.util.*;
public class Loops2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter number");
        number=sc.nextInt();


        while (number!=0)
        {
            int r=number%10;
            number=number/10;
            System.out.println(r+" ");

        }

        //palindrome
        int number1=121;
        int x=number1;
        int r=0;
        int rev=0;
        while (number1>0)
        {
             r=number1%10;
             rev=rev*10+r;
             number1=number1/10;

        }
        if (rev==x)
        {
            System.out.println("palindrome");
        }
        else System.out.println("not palindrome");

        //printing digits of a number in words
        int numb=837;
        String s=String.valueOf(numb);
        char c;
        for (int i=0 ; i<s.length();i++)
        {
            c=s.charAt(i);
            switch (c)
            {
                case '0':
                    System.out.println("zero");
                    break;
                case '1':
                    System.out.println("one");
                    break;
                case '2':
                    System.out.println("two");
                    break;
                case '3':
                    System.out.println("three");
                    break;
                case '4':
                    System.out.println("four");
                    break;
                case '5':
                    System.out.println("five");
                    break;
                case '6':
                    System.out.println("six");
                    break;
                case '7':
                    System.out.println("seven");
                    break;
                case '8':
                    System.out.println("eight");
                    break;
                case '9':
                    System.out.println("nine");
                    break;

            }
        }

    }
}
