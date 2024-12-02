package Exception_Handling;

public class two
{
    public static void main(String[] args) {
        int a[]={4,0,11,22};
        try
        {
            try
            {
                int c=a[0]/a[1];
                System.out.println(c);
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }


            System.out.println("haha");
            System.out.println(a[10]);

        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Hellew!!");
        }

        //here output will be both the exceptions along with finally

    }
}
