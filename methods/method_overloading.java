package methods;

public class method_overloading
{
    static int add(int x, int y)
    {
        return x+y;
    }
    static int add(int x,int y,int z)
    {
        return x+y+z;
    }
    public static void main(String[] args) {

        // in method overloading , only method name, no of parameters and parameter type is compared to check if they are the same methods

        int a=9,b=1;
        byte c=1,d=4;
        System.out.println(add(a,b));//integer is also compatible with float so even if we write add method which returns float and has float as parameters,the output will be obtained
        System.out.println(add(c,d)); //output is visible bcoz byte is compatible with integer but integer is not compatible with byte
        System.out.println(add(a,b,7));

    }
}
