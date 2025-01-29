package JavaGenerics;


class MyArray2<T>
{
    T[] A=(T[]) new Object[10];
    public int length=0;


    public void aappend(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

}

class MyArray3 extends MyArray2<String>
{

}

//class MyArray4 extends MyArray2
//{
//
//}   allowed and it will take type as Object

//class MyArray4 extends MyArray2<T>{
//
//} not allowed. In this case it will be allowed only if you properly mention the specific type as a parameter


class MyArray4<T> extends MyArray2<T>
{

}

//class MyArray5<T> extends MyArray2
//{
//
//}  allowed

//this is called as Bounded Types
class MyArray5<T extends Number>
{

}
public class JG5
{
    public static void main(String[] args) {
        MyArray2<Integer> m=new MyArray2<>();
        m.aappend(2);
        m.display();

        MyArray2 m1=new MyArray2();  //here we havent mentioned angular brackets so we havent mentioned the type of data which is going to be stored inside the array. so we can store anything\
        m1.aappend("susj");
        m1.aappend(1);
        m1.display();   //that is if parameter (<Parameter>) is not given , then it is treated as object


MyArray3 m2=new MyArray3();
//m2.append(1);    not allowed coz we are inheriting MyArray2 for String values only
        m2.aappend("ss");
        m2.aappend("pallavi rahul palkar");


        MyArray4<String> m3=new MyArray4<>();
        m3.aappend("hh");



//        MyArray5<String> m4=new MyArray5<String>();             this will give error bcoz MyArray5 can have generic data type which will extend from Number class like Byte,Short,Integer,Long,Float and Double. only
        MyArray5<Float> m4=new MyArray5<>();   //this will not cause any error


        
    }
}
