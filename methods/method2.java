package methods;

public class method2
{
    static boolean isprime(int num)
    {
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            return true;
        }
        return false;
        /*another way to solve this question
           for(int i=2;i<n/2;i++)
           {
             if(num%i==0)
             {
             return false;
             }

           }
           return true;
        */
    }

    static int GCD(int x,int y)
    {
        while (x!=y)
        {
            if (x>y)
            {
                x=x-y;
            }
            else if (y>x)
            {
                y=y-x;
            }
        }
        return x;
    }
    static int max(int arr[])
    {
        int max=arr[0];
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int num1=33,num2=19;
        System.out.println(num1+" "+isprime(num1));
        System.out.println(num2+" "+isprime(num2));

        //finding gcd of two numbers
        System.out.println("GCD of 25 and 15 are: "+GCD(18,12));

        //max of an array
        int arr[]={22,12,35,44,23};
        System.out.println("max ele of array is: "+max(arr));

    }
}
