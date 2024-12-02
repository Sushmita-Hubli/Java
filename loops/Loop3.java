package loops;
import java.util.*;
public class Loop3
{
    public static void main(String[] args) {
        //printing arithematic series
        int a=3,d=2;
        int n=10;
        int arr[]=new int[10];
        for (int i=0; i<10;i++)
        {
            //3,5,7,9,11,13,15,17,19,21
            arr[i]=a;
            System.out.println(arr[i]);
            a=a+d;

        }
        //gp
        System.out.println("\n");
        int b=3;
        int r=3;
        int arr2[]=new int[10];
        //3,9,27,81
        for (int i=0;i<10;i++)
        {
            arr2[i]=b;
            System.out.println(arr2[i]);
            b=b*r;
        }


        //printing first 10 numbers of fibonnaci series
        //0,1,1,2,3,5,8,13
        System.out.println("\n\n");
        int x=0;
        int y=1;
        int e;
        System.out.println(x);
        System.out.println(y);
        for (int i=2;i<10;i++)
        {
            e=x+y;
            System.out.println(e);
            x=y;
            y=e;

        }


    }
}
