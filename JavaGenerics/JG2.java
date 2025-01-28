package JavaGenerics;

public class JG2<T>
{
        T data[]=(T[])new Object[3];

    public static void main(String[] args) {

        JG2<String> a=new JG2<>();
        JG2<Integer> b=new JG2<>();

        a.data[0]="he";
        a.data[1]="hm";
//        a.data[2]=new Integer(11);   now we can see error during compile time only
        a.data[2]="55";
String str=a.data[0];  //we didnt typecaste here

        b.data[0]=1;
        b.data[1]=22;
        b.data[2]=333;

        

    }
}
