package loops;
import java.util.*;

public class Loops
{
    public static void main(String[] args) {
        int i=100;
        System.out.println("While loop");
        while(i<100)
        {
            System.out.println(i);
            i=i*2;
        }
        System.out.println("done\n\n");
        System.out.println("do while loop");
        int j=100;
        do {
            System.out.println(j);
            j=j*2;
        }while (j<100);
        System.out.println("hehe done");


        //all the three parameters we give inside for loop are optional
        int sum=0;
        for (int k=0; k<=10;k++)
        {
            sum+=k;
        }
        System.out.println(sum);

        //factorial using for loop
        int factorial=1;
        int num;
        System.out.println("Enter a NUMBER :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num==0)
        {
            System.out.println("factorial = 1");
        }
        else
        {
            for (int l=1 ;l<=num;l++ )
            {
                factorial*=l;
            }
            System.out.println(factorial);
        }


    }
}
