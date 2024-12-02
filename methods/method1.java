package methods;

public class method1
{
    static int max(int a,int b)
    {
        if (a>b)
        {
            return a;
        }
        return b;
    }
    static void haha(int a)
    {
        a++;
        System.out.println(a);
    }
    static void update(int arr[])
    {
        arr[0]=25;
        System.out.println("inside method: "+arr[0]);
    }
    static String changename(String name)
    {
        name="sushu";
        return name;
    }
    public static void main(String[] args) {
        int a=5,b=6;
        System.out.println(max(a,b));

        //passing data members as parameters vs passing objects as parameters
        //data members
        haha(a); //output here is 6 coz a was incremented in method but this does not change the original value of a which is equal to 5
        System.out.println(a); //output here is 5 bcoz it is original value of data member a

        //passsing objects as parameters
        int arr[]={1,2,3,4};
        update(arr);     //output here is 25 since updated
        System.out.println("outside method: "+arr[0]); //output here is 25 bcoz the object was passed as parameter

        //return type as an object
        String name="harry";
        String newname=changename(name);
        System.out.println("outside method: "+name);
        System.out.println("new name:"+newname);


    }
}
