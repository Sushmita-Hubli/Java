package methods;

public class method_overloading_examples
{
    static int rev(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int r=num%10;
            num=num/10;
            rev=(rev*10)+r;
        }
        return rev;
    }
    static void rev(int arr[])
    {
        int brr[]=new int[arr.length];
        for(int i=0,j= arr.length-1;i< arr.length;i++,j--)
        {
            brr[i]=arr[j];
        }
        for (int i=0;i<brr.length;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }

    static void validate(String name)
    {
        int count=0;
        for (int i=0;i<name.length();i++)
        {
            if( (name.charAt(i)>=32 && name.charAt(i)<=64) || (name.charAt(i)>=91 &&name.charAt(i)<=96) || (name.charAt(i)>=123 && name.charAt(i)<=126) )
            {
               count=1;
               break;

            }

        }

       if (count==1)
       {
           System.out.println("false");
       }
       else
        System.out.println("true");
    }

    static void validate(int x)
    {
        if (x>=18)
        {
            System.out.println("false");
        }
        else
        System.out.println("true");
    }
    public static void main(String[] args) {
        //method overloading for reversing a integer value and reversing an array
        int num=387;
        int arr[]={1,2,3,4};
        System.out.println("Integer reversing "+rev(num));
        rev(arr);

        System.out.println();
        //validate age and name
        validate("Sushmita");
        validate("varni@10");
        validate(22);
        validate(17);
    }
}
