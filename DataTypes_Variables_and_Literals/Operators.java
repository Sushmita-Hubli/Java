package DataTypes_Variables_and_Literals;
import java.util.*;

public class Operators
{
    public static void main(String[] args) {
        float base;
        float height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of the trainagel : ");
        base=sc.nextInt();
        System.out.println("Enter height of the trianglr : ");
        height=sc.nextInt();
        float area=base*height/2;
        System.out.println("Area of triangle is  : "+area);


    }
}
