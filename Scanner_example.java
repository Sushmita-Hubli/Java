import java.util.*;
public class Scanner_example
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter your age");
        a=sc.nextInt();
        // Consume the leftover newline character
        sc.nextLine();
        System.out.println("Enter your name");
        String name;
        name=sc.nextLine();
        System.out.println("Welcome!!"+name+" \nage:"+a);

    }
}
