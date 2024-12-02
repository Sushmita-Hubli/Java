package DataTypes_Variables_and_Literals;
import java.util.*;

public class quadratic
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the numbers a , b , c such that they form ax2+bx+c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double root1=(-b+Math.sqrt((b*b)-(4*a*c)))/2;
        double root2=(-b-Math.sqrt((b*b)-(4*a*c)))/2;
        System.out.println("two roots of the equation are: "+root1+" and "+root2);


        // pre- and post-INCREMENT
        int x=6;
        int y=++x;
        System.out.println(x);
        System.out.println(y);
        int z=x++;
        System.out.println(x+" "+z);

        int g=7;
        int expression= 4*g++ + ++g; //4*7 + 9=37
        System.out.println(expression);



    }
}
